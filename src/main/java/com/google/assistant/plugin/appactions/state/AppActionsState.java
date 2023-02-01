package com.google.assistant.plugin.appactions.state;

import com.android.ide.common.rendering.api.ResourceValue;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: ProjectStateSubject.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��*\n\u0002\u0018\u0002\n\u0002\u0010��\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\b6\u0018��2\u00020\u0001:\u0007\u0003\u0004\u0005\u0006\u0007\b\tB\u0007\b\u0002¢\u0006\u0002\u0010\u0002\u0082\u0001\u0007\n\u000b\f\r\u000e\u000f\u0010¨\u0006\u0011"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "", "()V", "ErrorMergingManifest", "InvalidActionsResource", "MissingAppActionsXml", "MissingManifestMetadata", "MissingMergedManifest", "Ready", "UnexpectedAppActionsResource", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$Ready;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$ErrorMergingManifest;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$MissingMergedManifest;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$MissingManifestMetadata;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$InvalidActionsResource;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$MissingAppActionsXml;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState$UnexpectedAppActionsResource;", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState.class */
public abstract class AppActionsState {
    private AppActionsState() {
    }

    public /* synthetic */ AppActionsState(DefaultConstructorMarker $constructor_marker) {
        this();
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$Ready;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "actionsResourceItem", "Lcom/android/ide/common/rendering/api/ResourceValue;", "(Lcom/android/ide/common/rendering/api/ResourceValue;)V", "getActionsResourceItem", "()Lcom/android/ide/common/rendering/api/ResourceValue;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$Ready.class */
    public static final class Ready extends AppActionsState {
        @NotNull
        private final ResourceValue actionsResourceItem;

        @NotNull
        public final ResourceValue getActionsResourceItem() {
            return this.actionsResourceItem;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Ready(@NotNull ResourceValue actionsResourceItem) {
            super(null);
            Intrinsics.checkNotNullParameter(actionsResourceItem, "actionsResourceItem");
            this.actionsResourceItem = actionsResourceItem;
        }
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u0003\n\u0002\b\u0004\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$ErrorMergingManifest;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "e", "", "(Ljava/lang/Throwable;)V", "getE", "()Ljava/lang/Throwable;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$ErrorMergingManifest.class */
    public static final class ErrorMergingManifest extends AppActionsState {
        @NotNull
        private final Throwable e;

        @NotNull
        public final Throwable getE() {
            return this.e;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ErrorMergingManifest(@NotNull Throwable e) {
            super(null);
            Intrinsics.checkNotNullParameter(e, "e");
            this.e = e;
        }
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$MissingMergedManifest;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "()V", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$MissingMergedManifest.class */
    public static final class MissingMergedManifest extends AppActionsState {
        @NotNull
        public static final MissingMergedManifest INSTANCE = new MissingMergedManifest();

        private MissingMergedManifest() {
            super(null);
        }
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018��2\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002¨\u0006\u0003"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$MissingManifestMetadata;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "()V", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$MissingManifestMetadata.class */
    public static final class MissingManifestMetadata extends AppActionsState {
        @NotNull
        public static final MissingManifestMetadata INSTANCE = new MissingManifestMetadata();

        private MissingManifestMetadata() {
            super(null);
        }
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$InvalidActionsResource;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "invalidValue", "", "(Ljava/lang/String;)V", "getInvalidValue", "()Ljava/lang/String;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$InvalidActionsResource.class */
    public static final class InvalidActionsResource extends AppActionsState {
        @NotNull
        private final String invalidValue;

        @NotNull
        public final String getInvalidValue() {
            return this.invalidValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public InvalidActionsResource(@NotNull String invalidValue) {
            super(null);
            Intrinsics.checkNotNullParameter(invalidValue, "invalidValue");
            this.invalidValue = invalidValue;
        }
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$MissingAppActionsXml;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "expectedResource", "", "(Ljava/lang/String;)V", "getExpectedResource", "()Ljava/lang/String;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$MissingAppActionsXml.class */
    public static final class MissingAppActionsXml extends AppActionsState {
        @NotNull
        private final String expectedResource;

        @NotNull
        public final String getExpectedResource() {
            return this.expectedResource;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public MissingAppActionsXml(@NotNull String expectedResource) {
            super(null);
            Intrinsics.checkNotNullParameter(expectedResource, "expectedResource");
            this.expectedResource = expectedResource;
        }
    }

    /* compiled from: ProjectStateSubject.kt */
    @Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n��\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018��2\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/AppActionsState$UnexpectedAppActionsResource;", "Lcom/google/assistant/plugin/appactions/state/AppActionsState;", "resourceValue", "Lcom/android/ide/common/rendering/api/ResourceValue;", "(Lcom/android/ide/common/rendering/api/ResourceValue;)V", "getResourceValue", "()Lcom/android/ide/common/rendering/api/ResourceValue;", "app-actions-test-tool-kotlin"})
    /* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/AppActionsState$UnexpectedAppActionsResource.class */
    public static final class UnexpectedAppActionsResource extends AppActionsState {
        @NotNull
        private final ResourceValue resourceValue;

        @NotNull
        public final ResourceValue getResourceValue() {
            return this.resourceValue;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UnexpectedAppActionsResource(@NotNull ResourceValue resourceValue) {
            super(null);
            Intrinsics.checkNotNullParameter(resourceValue, "resourceValue");
            this.resourceValue = resourceValue;
        }
    }
}
