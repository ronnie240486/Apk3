package com.google.android.gms.common.api;

/* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
/* JADX INFO: loaded from: classes.dex */
public final class Batch extends com.google.android.gms.common.api.internal.BasePendingResult<com.google.android.gms.common.api.BatchResult> {
    private int zae;
    private boolean zaf;
    private boolean zag;
    private final com.google.android.gms.common.api.PendingResult<?>[] zah;
    private final java.lang.Object zai;

    /* JADX INFO: compiled from: com.google.android.gms:play-services-base@@18.0.1 */
    public static final class Builder {
        private java.util.List<com.google.android.gms.common.api.PendingResult<?>> zaa;
        private com.google.android.gms.common.api.GoogleApiClient zab;

        public Builder(@androidx.annotation.NonNull com.google.android.gms.common.api.GoogleApiClient r2) {
                r1 = this;
                r1.<init>()
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                r1.zaa = r0
                r1.zab = r2
                return
        }

        @androidx.annotation.NonNull
        public <R extends com.google.android.gms.common.api.Result> com.google.android.gms.common.api.BatchResultToken<R> add(@androidx.annotation.NonNull com.google.android.gms.common.api.PendingResult<R> r3) {
                r2 = this;
                com.google.android.gms.common.api.BatchResultToken r0 = new com.google.android.gms.common.api.BatchResultToken
                java.util.List<com.google.android.gms.common.api.PendingResult<?>> r1 = r2.zaa
                int r1 = r1.size()
                r0.<init>(r1)
                java.util.List<com.google.android.gms.common.api.PendingResult<?>> r1 = r2.zaa
                r1.add(r3)
                return r0
        }

        @androidx.annotation.NonNull
        public com.google.android.gms.common.api.Batch build() {
                r3 = this;
                com.google.android.gms.common.api.Batch r0 = new com.google.android.gms.common.api.Batch
                java.util.List<com.google.android.gms.common.api.PendingResult<?>> r1 = r3.zaa
                com.google.android.gms.common.api.GoogleApiClient r2 = r3.zab
                r0.<init>(r1, r2)
                return r0
        }
    }

    public /* synthetic */ Batch(java.util.List r3, com.google.android.gms.common.api.GoogleApiClient r4) {
            r2 = this;
            r2.<init>(r4)
            java.lang.Object r4 = new java.lang.Object
            r4.<init>()
            r2.zai = r4
            int r4 = r3.size()
            r2.zae = r4
            com.google.android.gms.common.api.PendingResult[] r4 = new com.google.android.gms.common.api.PendingResult[r4]
            r2.zah = r4
            boolean r0 = r3.isEmpty()
            if (r0 != 0) goto L37
            r4 = 0
        L1b:
            int r0 = r3.size()
            if (r4 >= r0) goto L36
            java.lang.Object r0 = r3.get(r4)
            com.google.android.gms.common.api.PendingResult r0 = (com.google.android.gms.common.api.PendingResult) r0
            com.google.android.gms.common.api.PendingResult<?>[] r1 = r2.zah
            r1[r4] = r0
            com.google.android.gms.common.api.zab r1 = new com.google.android.gms.common.api.zab
            r1.<init>(r2)
            r0.addStatusListener(r1)
            int r4 = r4 + 1
            goto L1b
        L36:
            return
        L37:
            com.google.android.gms.common.api.BatchResult r3 = new com.google.android.gms.common.api.BatchResult
            com.google.android.gms.common.api.Status r0 = com.google.android.gms.common.api.Status.RESULT_SUCCESS
            r3.<init>(r0, r4)
            r2.setResult(r3)
            return
    }

    public static /* bridge */ /* synthetic */ int zaa(com.google.android.gms.common.api.Batch r0) {
            int r0 = r0.zae
            return r0
    }

    public static /* bridge */ /* synthetic */ java.lang.Object zab(com.google.android.gms.common.api.Batch r0) {
            java.lang.Object r0 = r0.zai
            return r0
    }

    public static /* bridge */ /* synthetic */ void zac(com.google.android.gms.common.api.Batch r1) {
            r0 = 1
            r1.zaf = r0
            return
    }

    public static /* bridge */ /* synthetic */ void zad(com.google.android.gms.common.api.Batch r1) {
            r0 = 1
            r1.zag = r0
            return
    }

    public static /* bridge */ /* synthetic */ void zae(com.google.android.gms.common.api.Batch r0, int r1) {
            r0.zae = r1
            return
    }

    public static /* synthetic */ void zaf(com.google.android.gms.common.api.Batch r0) {
            super.cancel()
            return
    }

    public static /* bridge */ /* synthetic */ boolean zag(com.google.android.gms.common.api.Batch r0) {
            boolean r0 = r0.zaf
            return r0
    }

    public static /* bridge */ /* synthetic */ boolean zah(com.google.android.gms.common.api.Batch r0) {
            boolean r0 = r0.zag
            return r0
    }

    public static /* bridge */ /* synthetic */ com.google.android.gms.common.api.PendingResult[] zai(com.google.android.gms.common.api.Batch r0) {
            com.google.android.gms.common.api.PendingResult<?>[] r0 = r0.zah
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult, com.google.android.gms.common.api.PendingResult
    public void cancel() {
            r4 = this;
            super.cancel()
            com.google.android.gms.common.api.PendingResult<?>[] r0 = r4.zah
            int r1 = r0.length
            r2 = 0
        L7:
            if (r2 >= r1) goto L11
            r3 = r0[r2]
            r3.cancel()
            int r2 = r2 + 1
            goto L7
        L11:
            return
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @androidx.annotation.NonNull
    public com.google.android.gms.common.api.BatchResult createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r3) {
            r2 = this;
            com.google.android.gms.common.api.BatchResult r0 = new com.google.android.gms.common.api.BatchResult
            com.google.android.gms.common.api.PendingResult<?>[] r1 = r2.zah
            r0.<init>(r3, r1)
            return r0
    }

    @Override // com.google.android.gms.common.api.internal.BasePendingResult
    @androidx.annotation.NonNull
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.api.Result createFailedResult(@androidx.annotation.NonNull com.google.android.gms.common.api.Status r1) {
            r0 = this;
            com.google.android.gms.common.api.BatchResult r1 = r0.createFailedResult(r1)
            return r1
    }
}
