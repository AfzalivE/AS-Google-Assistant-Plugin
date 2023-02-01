package com.google.assistant.plugin.appactions.state;

import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.MapsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: ProjectStateSubject.kt */
@Metadata(mv = {1, 4, 2}, bv = {1, 0, 3}, k = 1, d1 = {"��0\n\u0002\u0018\u0002\n\u0002\u0010��\n��\n\u0002\u0018\u0002\n��\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\b\u0018��2\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\u0002\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0003J)\u0010\u000f\u001a\u00020��2\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n��\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n��\u001a\u0004\b\u000b\u0010\f¨\u0006\u0016"}, d2 = {"Lcom/google/assistant/plugin/appactions/state/ProjectState;", "", "projectSyncStatus", "Lcom/google/assistant/plugin/appactions/state/ProjectSyncStatus;", "androidApps", "", "", "Lcom/google/assistant/plugin/appactions/state/AndroidAppState;", "(Lcom/google/assistant/plugin/appactions/state/ProjectSyncStatus;Ljava/util/Map;)V", "getAndroidApps", "()Ljava/util/Map;", "getProjectSyncStatus", "()Lcom/google/assistant/plugin/appactions/state/ProjectSyncStatus;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "app-actions-test-tool-kotlin"})
/* loaded from: google-assistant-plugin-2.5.1.zip:google-assistant-plugin/lib/app-actions-test-tool-kotlin-2.5.1.jar:com/google/assistant/plugin/appactions/state/ProjectState.class */
public final class ProjectState {
    @NotNull
    private final ProjectSyncStatus projectSyncStatus;
    @NotNull
    private final Map<String, AndroidAppState> androidApps;

    public ProjectState() {
        this(null, null, 3, null);
    }

    @NotNull
    public final ProjectSyncStatus component1() {
        return this.projectSyncStatus;
    }

    @NotNull
    public final Map<String, AndroidAppState> component2() {
        return this.androidApps;
    }

    @NotNull
    public final ProjectState copy(@NotNull ProjectSyncStatus projectSyncStatus, @NotNull Map<String, AndroidAppState> map) {
        Intrinsics.checkNotNullParameter(projectSyncStatus, "projectSyncStatus");
        Intrinsics.checkNotNullParameter(map, "androidApps");
        return new ProjectState(projectSyncStatus, map);
    }

    public static /* synthetic */ ProjectState copy$default(ProjectState projectState, ProjectSyncStatus projectSyncStatus, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            projectSyncStatus = projectState.projectSyncStatus;
        }
        if ((i & 2) != 0) {
            map = projectState.androidApps;
        }
        return projectState.copy(projectSyncStatus, map);
    }

    @NotNull
    public String toString() {
        return "ProjectState(projectSyncStatus=" + this.projectSyncStatus + ", androidApps=" + this.androidApps + ")";
    }

    public int hashCode() {
        ProjectSyncStatus projectSyncStatus = this.projectSyncStatus;
        int hashCode = (projectSyncStatus != null ? projectSyncStatus.hashCode() : 0) * 31;
        Map<String, AndroidAppState> map = this.androidApps;
        return hashCode + (map != null ? map.hashCode() : 0);
    }

    public boolean equals(@Nullable Object obj) {
        if (this != obj) {
            if (obj instanceof ProjectState) {
                ProjectState projectState = (ProjectState) obj;
                return Intrinsics.areEqual(this.projectSyncStatus, projectState.projectSyncStatus) && Intrinsics.areEqual(this.androidApps, projectState.androidApps);
            }
            return false;
        }
        return true;
    }

    public ProjectState(@NotNull ProjectSyncStatus projectSyncStatus, @NotNull Map<String, AndroidAppState> map) {
        Intrinsics.checkNotNullParameter(projectSyncStatus, "projectSyncStatus");
        Intrinsics.checkNotNullParameter(map, "androidApps");
        this.projectSyncStatus = projectSyncStatus;
        this.androidApps = map;
    }

    @NotNull
    public final ProjectSyncStatus getProjectSyncStatus() {
        return this.projectSyncStatus;
    }

    public /* synthetic */ ProjectState(ProjectSyncStatus projectSyncStatus, Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? ProjectSyncStatus.Synchronizing : projectSyncStatus, (i & 2) != 0 ? MapsKt.emptyMap() : map);
    }

    @NotNull
    public final Map<String, AndroidAppState> getAndroidApps() {
        return this.androidApps;
    }
}
