package com.google.assistant.plugin.appactions.ui.toolwindow.frames

import actions.Plugin
import actions.UpdateAndroidActionPackageV2Request.LocalizedResource
import com.google.assistant.plugin.appactions.Constants
import com.google.assistant.plugin.appactions.api.HttpClient
import com.google.assistant.plugin.appactions.exceptions.AASProjectConfigurationException
import com.google.assistant.plugin.appactions.exceptions.ActionsBuilderException
import com.google.assistant.plugin.appactions.models.Model
import com.google.assistant.plugin.appactions.ui.PluginTosDialog
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsPanel
import com.google.assistant.plugin.appactions.ui.toolwindow.AppActionsTaskBackgroundable
import com.google.assistant.plugin.common.utils.DialogUtils
import com.google.assistant.plugin.common.utils.LocalizedResourcesBuilder
import com.google.assistant.plugin.common.utils.ProjectUtils
import com.google.gct.login.GoogleLogin
import com.intellij.openapi.application.ApplicationManager
import com.intellij.openapi.module.ModuleManager
import com.intellij.openapi.progress.ProgressIndicator
import com.intellij.openapi.util.ThrowableComputable
import java.awt.Component
import javax.swing.JPanel
import kotlin.jvm.functions.Function0
import kotlin.jvm.internal.Intrinsics
import kotlin.jvm.internal.iterator

/* compiled from: AppActionsFrame.kt */
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/AppActionsFrame.class */
abstract class AppActionsFrame(model: Model, mainPanel: AppActionsPanel) : JPanel() {
    @JvmField
    val httpClient: HttpClient
    open val model: Model
    open val mainPanel: AppActionsPanel

    init {
        Intrinsics.checkNotNullParameter(model, "model")
        Intrinsics.checkNotNullParameter(mainPanel, "mainPanel")
        this.model = model
        this.mainPanel = mainPanel
        httpClient = HttpClient()
    }

    @Throws(AASProjectConfigurationException::class)
    fun readPackageNameSafely(): String {
        val runReadAction: Any = ApplicationManager.getApplication().runReadAction(
            ThrowableComputable<String, AASProjectConfigurationException?>
            // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame$readPackageNameSafely$1
            {
                val actionModule = ProjectUtils.INSTANCE.getActionModule(model.project)
                ProjectUtils.INSTANCE.getPackageNameFromModule(actionModule)
            })
        Intrinsics.checkNotNullExpressionValue(runReadAction, "ApplicationManager.getAp…)\n            }\n        )")
        return runReadAction as String
    }

    fun createPreviewAndFetchIntentsTask(function0: (() -> Unit)?): AppActionsTaskBackgroundable {
        val task = AppActionsTaskBackgroundable("Setting up preview...", model, mainPanel)
        task.setOnRunHandler { progressIndicator: ProgressIndicator ->
            execute(progressIndicator)
            Unit
        }
        task.onFinishedHandler = function0
        return task
    }

    /* JADX INFO: Access modifiers changed from: private */
    fun execute(progressIndicator: ProgressIndicator) {
        val application = ApplicationManager.getApplication()
        Intrinsics.checkNotNullExpressionValue(application, "ApplicationManager.getApplication()")
        val z = !application.isWriteAccessAllowed
        if (!z) {
            throw AssertionError("Resolving references on dispatch thread leads to live lock")
        }
        val googleLogin = GoogleLogin.getInstance()
        Intrinsics.checkNotNullExpressionValue(googleLogin, "GoogleLogin.getInstance()")
        if (!googleLogin.isLoggedIn) {
            throw ActionsBuilderException("User is not logged in.")
        }
        val googleLogin2 = GoogleLogin.getInstance()
        Intrinsics.checkNotNullExpressionValue(googleLogin2, "GoogleLogin.getInstance()")
        if (googleLogin2.activeUser == null) {
            throw ActionsBuilderException("Failed to obtain user credentials.")
        }
        val selectedAndroidAppState = model.selectedAndroidAppState
        if (selectedAndroidAppState != null) {
            val packageName = selectedAndroidAppState.applicationId
            if (Intrinsics.areEqual(packageName, "uninitialized.application.id")) {
                throw ActionsBuilderException("Please build your project before creating preview.")
            }
            ApplicationManager.getApplication()
                .runReadAction<Unit, Exception>(object : ThrowableComputable<Unit, Exception?> {
                    // from class: com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame$execute$2
                    /* bridge */ /* synthetic */ override fun compute() {
                        m27compute()
                        return Unit
                    }

                    /* renamed from: compute  reason: collision with other method in class */
                    fun m27compute() {
                        progressIndicator.text = "Processing shortcuts.xml..."
                        val actionModule = ModuleManager.getInstance(model.project)
                            .findModuleByName(selectedAndroidAppState.moduleName)
                        if (actionModule != null) {
                            Intrinsics.checkNotNullExpressionValue(
                                actionModule,
                                "ModuleManager.getInstanc…eturn@ThrowableComputable"
                            )
                            mainPanel.isProgressBarVisible = true
                            val appResources = ProjectUtils.INSTANCE.getAppResources(actionModule)
                            val xmlBytes = ProjectUtils.INSTANCE.getXmlBytes(selectedAndroidAppState)
                            if (xmlBytes != null) {
                                val xmlContentType = ProjectUtils.INSTANCE.getXmlContentType(actionModule)
                                val resources: Set<LocalizedResource> = LocalizedResourcesBuilder.INSTANCE.buildLocalizedResourcesSet(
                                    xmlBytes,
                                    appResources
                                )
                                progressIndicator.text = "Creating preview..."
                                val accessToken = GoogleLogin.getInstance().fetchAccessToken()
                                    ?: throw ActionsBuilderException("Failed to obtain user credentials.")
                                Intrinsics.checkNotNullExpressionValue(
                                    accessToken,
                                    "GoogleLogin.getInstance(…IN_CREDENTIALS_ERROR_MSG)"
                                )
                                try {
                                    try {
                                        val aapResp = httpClient.updatePreviewV2(
                                            accessToken,
                                            packageName,
                                            model.invocationName,
                                            xmlBytes,
                                            xmlContentType,
                                            resources,
                                            model.locale
                                        )
                                        progressIndicator.text = "Finishing up..."
                                        val `$this$apply` = model
                                        val supportedIntentsList = aapResp.supportedIntentsList
                                        Intrinsics.checkNotNullExpressionValue(
                                            supportedIntentsList,
                                            "aapResp.supportedIntentsList"
                                        )
                                        `$this$apply`.setPreview(supportedIntentsList, aapResp.assistantLink)
                                        val previewSettings = aapResp.previewSettings
                                        Intrinsics.checkNotNullExpressionValue(
                                            previewSettings,
                                            "aapResp.previewSettings"
                                        )
                                        val invocationName = previewSettings.invocationName
                                        Intrinsics.checkNotNullExpressionValue(
                                            invocationName,
                                            "aapResp.previewSettings.invocationName"
                                        )
                                        `$this$apply`.setInvocationName(invocationName)
                                        val previewSettings2 = aapResp.previewSettings
                                        Intrinsics.checkNotNullExpressionValue(
                                            previewSettings2,
                                            "aapResp.previewSettings"
                                        )
                                        val locale = previewSettings2.locale
                                        Intrinsics.checkNotNullExpressionValue(locale, "aapResp.previewSettings.locale")
                                        `$this$apply`.locale = locale
                                        val validationResultsList = aapResp.validationResultsList
                                        Intrinsics.checkNotNullExpressionValue(
                                            validationResultsList,
                                            "aapResp.validationResultsList"
                                        )
                                        if (!validationResultsList.isEmpty()) {
                                            val validationErrorsList: MutableList<Plugin.ValidationError?> = arrayListOf()
                                            for (validationResult: Plugin.ValidationResult in aapResp.validationResultsList) {
                                                Intrinsics.checkNotNullExpressionValue(
                                                    validationResult,
                                                    "validationResult"
                                                )
                                                val validationErrorsList2 = validationResult.validationErrorsList
                                                Intrinsics.checkNotNullExpressionValue(
                                                    validationErrorsList2,
                                                    "validationResult.validationErrorsList"
                                                )
                                                validationErrorsList.addAll(validationErrorsList2)
                                            }
                                            for (validationError: Plugin.ValidationError? in validationErrorsList) {
                                                val dialogUtils = DialogUtils.INSTANCE
                                                val errorMessage = validationError!!.errorMessage
                                                Intrinsics.checkNotNullExpressionValue(
                                                    errorMessage,
                                                    "validationError.errorMessage"
                                                )
                                                val pathsList = validationError.pathsList
                                                Intrinsics.checkNotNullExpressionValue(
                                                    pathsList,
                                                    "validationError.pathsList"
                                                )
                                                dialogUtils.showNluValidationResults(errorMessage, pathsList)
                                            }
                                            DialogUtils.INSTANCE.showNluValidationMessage()
                                        }
                                        if (aapResp.supportedIntentsList.isEmpty()) {
                                            throw ActionsBuilderException("There are no intents added to your preview. Please add more details to your shortcuts.xml or your actions.xml.")
                                        }
                                        DialogUtils.INSTANCE.showInfoMessage("Preview created/updated successfully for package $packageName")
                                        mainPanel.isProgressBarVisible = false
                                    } catch (e: ActionsBuilderException) {
                                        val message = e.message
                                        if (message != null && message.contains(Constants.NO_TOS_ACCEPTED_MSG, false)) {
                                            ApplicationManager.getApplication().invokeLater {
                                                val tos = PluginTosDialog()
                                                tos.show()
                                            }
                                            mainPanel.isProgressBarVisible = false
                                            return
                                        }
                                        throw e
                                    }
                                } catch (th: Throwable) {
                                    mainPanel.isProgressBarVisible = false
                                    throw th
                                }
                            }
                        }
                    }

                    /* JADX INFO: Access modifiers changed from: package-private */ /* compiled from: AppActionsFrame.kt */
                    /* renamed from: com.google.assistant.plugin.appactions.ui.toolwindow.frames.AppActionsFrame$execute$2$3  reason: invalid class name */ /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/ui/toolwindow/frames/AppActionsFrame$execute$2$3.class */
                    inner class AnonymousClass3() : Runnable {
                        val INSTANCE = AnonymousClass3()

                        // java.lang.Runnable
                        override fun run() {
                            val tos = PluginTosDialog()
                            tos.show()
                        }
                    }
                })
        }
    }

    fun setPanelEnabled(isEnabled: Boolean) {
        setEnabled(isEnabled)
        val it: Iterator<*> = iterator(components)
        while (it.hasNext()) {
            val component = it.next() as Component
            Intrinsics.checkNotNullExpressionValue(component, "component")
            component.isEnabled = isEnabled
        }
    }

    companion object {
        @JvmStatic
        fun  /* synthetic */`createPreviewAndFetchIntentsTask$default`(
            appActionsFrame: AppActionsFrame,
            function0: (() -> Unit)?,
            i: Int,
            obj: Any?
        ): AppActionsTaskBackgroundable {
            var function0 = function0
            if (obj != null) {
                throw UnsupportedOperationException("Super calls with default arguments not supported in this target, function: createPreviewAndFetchIntentsTask")
            }
            if ((i and 1) != 0) {
                function0 = null
            }
            return appActionsFrame.createPreviewAndFetchIntentsTask(function0)
        }
    }
}
