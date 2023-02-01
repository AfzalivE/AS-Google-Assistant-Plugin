package com.google.assistant.plugin.shortcuts.models;

import com.google.assistant.plugin.appactions.state.DeviceProperties;
import com.google.assistant.plugin.shortcuts.listeners.PackageNameListListener;
import com.google.assistant.plugin.shortcuts.listeners.ShortcutUpdateListener;
import com.google.common.collect.ImmutableList;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: Model.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��R\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u000e\u0010%\u001a\u00020&2\u0006\u0010'\u001a\u00020\u0012J\u000e\u0010(\u001a\u00020&2\u0006\u0010'\u001a\u00020!J\u0006\u0010)\u001a\u00020&J\u0012\u0010*\u001a\u0004\u0018\u00010\u00042\u0006\u0010+\u001a\u00020,H\u0002J\b\u0010-\u001a\u00020&H\u0002J\b\u0010.\u001a\u00020&H\u0002J\b\u0010/\u001a\u00020&H\u0002R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\n2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\n@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u001e\u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u0011j\b\u0012\u0004\u0012\u00020\u0012`\u0013X\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u0015X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0019R(\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\t\u001a\u0004\u0018\u00010\u001a@FX\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010 \u001a\u0012\u0012\u0004\u0012\u00020!0\u0011j\b\u0012\u0004\u0012\u00020!`\u0013X\u0082\u0004¢\u0006\u0002\n��R\u001c\u0010\"\u001a\u0004\u0018\u00010\u0004X\u0086\u000e¢\u0006\u000e\n��\u001a\u0004\b#\u0010\u0006\"\u0004\b$\u0010\b¨\u00060"}, d2 = {"Lcom/google/assistant/plugin/shortcuts/models/Model;", "", "()V", "packageName", "", "getPackageName", "()Ljava/lang/String;", "setPackageName", "(Ljava/lang/String;)V", "value", "Lcom/google/common/collect/ImmutableList;", "packageNameList", "getPackageNameList", "()Lcom/google/common/collect/ImmutableList;", "setPackageNameList", "(Lcom/google/common/collect/ImmutableList;)V", "packageNameListListeners", "Ljava/util/ArrayList;", "Lcom/google/assistant/plugin/shortcuts/listeners/PackageNameListListener;", "Lkotlin/collections/ArrayList;", "selectedDevice", "Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "getSelectedDevice", "()Lcom/google/assistant/plugin/appactions/state/DeviceProperties;", "setSelectedDevice", "(Lcom/google/assistant/plugin/appactions/state/DeviceProperties;)V", "Lcom/google/assistant/plugin/shortcuts/models/DisplayShortcut;", "selectedShortcut", "getSelectedShortcut", "()Lcom/google/assistant/plugin/shortcuts/models/DisplayShortcut;", "setSelectedShortcut", "(Lcom/google/assistant/plugin/shortcuts/models/DisplayShortcut;)V", "shortcutListeners", "Lcom/google/assistant/plugin/shortcuts/listeners/ShortcutUpdateListener;", "shortcutTestCommand", "getShortcutTestCommand", "setShortcutTestCommand", "addPackageNameListListener", "", "listener", "addShortcutListener", "clearAllListeners", "constructShortcutTriggerCommand", "intent", "Lcom/google/assistant/plugin/shortcuts/models/DisplayIntent;", "firePackageNameListChanged", "fireShortcutChanged", "updateAdbCommand", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/shortcuts/models/Model.class */
public final class Model {
    @Nullable
    private DeviceProperties selectedDevice;
    @Nullable
    private String packageName;
    @Nullable
    private DisplayShortcut selectedShortcut;
    @NotNull
    private ImmutableList<String> packageNameList;
    @Nullable
    private String shortcutTestCommand;
    private final ArrayList<ShortcutUpdateListener> shortcutListeners;
    private final ArrayList<PackageNameListListener> packageNameListListeners;

    public Model() {
        ImmutableList<String> of = ImmutableList.of();
        Intrinsics.checkNotNullExpressionValue(of, "ImmutableList.of()");
        this.packageNameList = of;
        this.shortcutListeners = new ArrayList<>();
        this.packageNameListListeners = new ArrayList<>();
    }

    @Nullable
    public final DeviceProperties getSelectedDevice() {
        return this.selectedDevice;
    }

    public final void setSelectedDevice(@Nullable DeviceProperties deviceProperties) {
        this.selectedDevice = deviceProperties;
    }

    @Nullable
    public final String getPackageName() {
        return this.packageName;
    }

    public final void setPackageName(@Nullable String str) {
        this.packageName = str;
    }

    @Nullable
    public final DisplayShortcut getSelectedShortcut() {
        return this.selectedShortcut;
    }

    public final void setSelectedShortcut(@Nullable DisplayShortcut value) {
        this.selectedShortcut = value;
        updateAdbCommand();
        fireShortcutChanged();
    }

    @NotNull
    public final ImmutableList<String> getPackageNameList() {
        return this.packageNameList;
    }

    public final void setPackageNameList(@NotNull ImmutableList<String> immutableList) {
        Intrinsics.checkNotNullParameter(immutableList, "value");
        this.packageNameList = immutableList;
        firePackageNameListChanged();
    }

    @Nullable
    public final String getShortcutTestCommand() {
        return this.shortcutTestCommand;
    }

    public final void setShortcutTestCommand(@Nullable String str) {
        this.shortcutTestCommand = str;
    }

    public final void addShortcutListener(@NotNull ShortcutUpdateListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.shortcutListeners.add(listener);
    }

    public final void addPackageNameListListener(@NotNull PackageNameListListener listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.packageNameListListeners.add(listener);
    }

    private final void updateAdbCommand() {
        List intents;
        this.shortcutTestCommand = null;
        DisplayShortcut displayShortcut = this.selectedShortcut;
        DisplayIntent lastIntent = (displayShortcut == null || (intents = displayShortcut.intents) == null) ? null : (DisplayIntent) CollectionsKt.last(intents);
        if (lastIntent != null && this.selectedDevice != null) {
            this.shortcutTestCommand = constructShortcutTriggerCommand(lastIntent);
        }
    }

    private final void fireShortcutChanged() {
        Iterable $this$forEach$iv = this.shortcutListeners;
        for (Object element$iv : $this$forEach$iv) {
            ShortcutUpdateListener it = (ShortcutUpdateListener) element$iv;
            it.getOnUpdate().invoke(this.selectedShortcut);
        }
    }

    private final void firePackageNameListChanged() {
        Iterable $this$forEach$iv = this.packageNameListListeners;
        for (Object element$iv : $this$forEach$iv) {
            PackageNameListListener it = (PackageNameListListener) element$iv;
            it.getOnUpdate().invoke(this.packageNameList);
        }
    }

    private final String constructShortcutTriggerCommand(DisplayIntent intent) {
        if (intent.getAction() == null) {
            return null;
        }
        String command = "am start -a " + intent.getAction();
        if (intent.getData() != null) {
            command = command + " -d \"" + intent.getData() + '\"';
        }
        if (intent.getType() != null) {
            command = command + " -t " + intent.getType();
        }
        if (intent.getComponent() != null) {
            command = command + " -n " + intent.getComponent();
        }
        return command;
    }

    public final void clearAllListeners() {
        this.shortcutListeners.clear();
        this.packageNameListListeners.clear();
    }
}
