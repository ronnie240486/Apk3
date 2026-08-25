package com.google.android.play.core.splitinstall;

/* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
/* JADX INFO: loaded from: classes.dex */
public class SplitInstallRequest {
    private final java.util.List zza;
    private final java.util.List zzb;

    /* JADX INFO: compiled from: com.google.android.play:core@@1.10.3 */
    /* JADX INFO: loaded from: classes2.dex */
    public static class Builder {
        private final java.util.List zza;
        private final java.util.List zzb;

        private Builder() {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zza = r0
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zzb = r0
                return
        }

        public /* synthetic */ Builder(com.google.android.play.core.splitinstall.zzai r1) {
                r0 = this;
                r0.<init>()
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zza = r1
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>()
                r0.zzb = r1
                return
        }

        public static /* bridge */ /* synthetic */ java.util.List zza(com.google.android.play.core.splitinstall.SplitInstallRequest.Builder r0) {
                java.util.List r0 = r0.zzb
                return r0
        }

        public static /* bridge */ /* synthetic */ java.util.List zzb(com.google.android.play.core.splitinstall.SplitInstallRequest.Builder r0) {
                java.util.List r0 = r0.zza
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.android.play.core.splitinstall.SplitInstallRequest.Builder addLanguage(@androidx.annotation.Nullable java.util.Locale r2) {
                r1 = this;
                java.util.List r0 = r1.zzb
                r0.add(r2)
                return r1
        }

        public com.google.android.play.core.splitinstall.SplitInstallRequest.Builder addModule(java.lang.String r2) {
                r1 = this;
                java.util.List r0 = r1.zza
                r0.add(r2)
                return r1
        }

        @androidx.annotation.NonNull
        public com.google.android.play.core.splitinstall.SplitInstallRequest build() {
                r1 = this;
                com.google.android.play.core.splitinstall.SplitInstallRequest r0 = new com.google.android.play.core.splitinstall.SplitInstallRequest
                r0.<init>(r1)
                return r0
        }
    }

    public /* synthetic */ SplitInstallRequest(com.google.android.play.core.splitinstall.SplitInstallRequest.Builder r3) {
            r2 = this;
            r2.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r1 = com.google.android.play.core.splitinstall.SplitInstallRequest.Builder.zzb(r3)
            r0.<init>(r1)
            r2.zza = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            java.util.List r3 = com.google.android.play.core.splitinstall.SplitInstallRequest.Builder.zza(r3)
            r0.<init>(r3)
            r2.zzb = r0
            return
    }

    @androidx.annotation.NonNull
    public static com.google.android.play.core.splitinstall.SplitInstallRequest.Builder newBuilder() {
            com.google.android.play.core.splitinstall.SplitInstallRequest$Builder r0 = new com.google.android.play.core.splitinstall.SplitInstallRequest$Builder
            r1 = 0
            r0.<init>(r1)
            return r0
    }

    public java.util.List<java.util.Locale> getLanguages() {
            r1 = this;
            java.util.List r0 = r1.zzb
            return r0
    }

    public java.util.List<java.lang.String> getModuleNames() {
            r1 = this;
            java.util.List r0 = r1.zza
            return r0
    }

    public java.lang.String toString() {
            r3 = this;
            r0 = 2
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.util.List r1 = r3.zza
            r2 = 0
            r0[r2] = r1
            java.util.List r1 = r3.zzb
            r2 = 1
            r0[r2] = r1
            java.lang.String r1 = "SplitInstallRequest{modulesNames=%s,languages=%s}"
            java.lang.String r0 = java.lang.String.format(r1, r0)
            return r0
    }
}
