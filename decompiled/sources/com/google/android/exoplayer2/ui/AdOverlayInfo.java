package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes3.dex */
public final class AdOverlayInfo {
    public static final int PURPOSE_CLOSE_AD = 2;
    public static final int PURPOSE_CONTROLS = 1;
    public static final int PURPOSE_NOT_VISIBLE = 4;
    public static final int PURPOSE_OTHER = 3;
    public final int purpose;

    @androidx.annotation.Nullable
    public final java.lang.String reasonDetail;
    public final android.view.View view;

    /* JADX INFO: loaded from: classes2.dex */
    public static final class Builder {

        @androidx.annotation.Nullable
        private java.lang.String detailedReason;
        private final int purpose;
        private final android.view.View view;

        public Builder(android.view.View r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.view = r1
                r0.purpose = r2
                return
        }

        public com.google.android.exoplayer2.ui.AdOverlayInfo build() {
                r4 = this;
                com.google.android.exoplayer2.ui.AdOverlayInfo r0 = new com.google.android.exoplayer2.ui.AdOverlayInfo
                android.view.View r1 = r4.view
                int r2 = r4.purpose
                java.lang.String r3 = r4.detailedReason
                r0.<init>(r1, r2, r3)
                return r0
        }

        @com.google.errorprone.annotations.CanIgnoreReturnValue
        public com.google.android.exoplayer2.ui.AdOverlayInfo.Builder setDetailedReason(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.detailedReason = r1
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @java.lang.annotation.Target({java.lang.annotation.ElementType.FIELD, java.lang.annotation.ElementType.METHOD, java.lang.annotation.ElementType.PARAMETER, java.lang.annotation.ElementType.LOCAL_VARIABLE, java.lang.annotation.ElementType.TYPE_USE})
    @java.lang.annotation.Documented
    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    public @interface Purpose {
    }

    @java.lang.Deprecated
    public AdOverlayInfo(android.view.View r2, int r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    @java.lang.Deprecated
    public AdOverlayInfo(android.view.View r1, int r2, @androidx.annotation.Nullable java.lang.String r3) {
            r0 = this;
            r0.<init>()
            r0.view = r1
            r0.purpose = r2
            r0.reasonDetail = r3
            return
    }
}
