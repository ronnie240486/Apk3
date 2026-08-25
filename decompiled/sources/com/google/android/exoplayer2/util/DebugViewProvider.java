package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public interface DebugViewProvider {
    public static final com.google.android.exoplayer2.util.DebugViewProvider NONE = null;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.util.DebugViewProvider$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class CC {
        static {
                com.google.android.exoplayer2.util.DebugViewProvider r0 = com.google.android.exoplayer2.util.DebugViewProvider.NONE
                return
        }

        public static /* synthetic */ android.view.SurfaceView lambda$static$0(int r0, int r1) {
                r0 = 0
                return r0
        }
    }

    static {
            io.realm.Realm$$ExternalSyntheticLambda0 r0 = io.realm.Realm$$ExternalSyntheticLambda0.INSTANCE$24
            com.google.android.exoplayer2.util.DebugViewProvider.NONE = r0
            return
    }

    @androidx.annotation.Nullable
    android.view.SurfaceView getDebugPreviewSurfaceView(int r1, int r2);
}
