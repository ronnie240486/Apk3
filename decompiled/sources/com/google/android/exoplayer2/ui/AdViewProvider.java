package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
public interface AdViewProvider {

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.AdViewProvider$-CC, reason: invalid class name */
    public final /* synthetic */ class CC {
        public static java.util.List $default$getAdOverlayInfos(com.google.android.exoplayer2.ui.AdViewProvider r0) {
                com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
                return r0
        }
    }

    java.util.List<com.google.android.exoplayer2.ui.AdOverlayInfo> getAdOverlayInfos();

    @androidx.annotation.Nullable
    android.view.ViewGroup getAdViewGroup();
}
