package com.google.android.exoplayer2;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ExoPlayerImplInternal$$ExternalSyntheticLambda0 implements com.google.common.base.Supplier {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ ExoPlayerImplInternal$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.google.common.base.Supplier
    public final java.lang.Object get() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lf
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.ExoPlayerImplInternal r0 = (com.google.android.exoplayer2.ExoPlayerImplInternal) r0
            java.lang.Boolean r0 = com.google.android.exoplayer2.ExoPlayerImplInternal.$r8$lambda$1_DjYPkjLUEXuPoxE5lNi4y5U_o(r0)
            return r0
        Lf:
            java.lang.Object r0 = r1.f$0
            java.util.concurrent.atomic.AtomicBoolean r0 = (java.util.concurrent.atomic.AtomicBoolean) r0
            boolean r0 = r0.get()
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }
}
