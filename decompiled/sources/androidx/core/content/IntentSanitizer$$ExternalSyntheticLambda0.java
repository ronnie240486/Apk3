package androidx.core.content;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class IntentSanitizer$$ExternalSyntheticLambda0 implements androidx.core.util.Consumer {
    public static final /* synthetic */ androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 INSTANCE = null;
    public static final /* synthetic */ androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 INSTANCE$1 = null;
    public final /* synthetic */ int $r8$classId;

    static {
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0
            r1 = 0
            r0.<init>(r1)
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0.INSTANCE = r0
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0 r0 = new androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0
            r1 = 1
            r0.<init>(r1)
            androidx.core.content.IntentSanitizer$$ExternalSyntheticLambda0.INSTANCE$1 = r0
            return
    }

    public /* synthetic */ IntentSanitizer$$ExternalSyntheticLambda0(int r1) {
            r0 = this;
            r0.$r8$classId = r1
            r0.<init>()
            return
    }

    @Override // androidx.core.util.Consumer
    public final void accept(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            java.lang.String r2 = (java.lang.String) r2
            androidx.core.content.IntentSanitizer.$r8$lambda$cs9npxBvv_qtzxpDgSnPy7MmurY(r2)
            return
        Lc:
            java.lang.String r2 = (java.lang.String) r2
            androidx.core.content.IntentSanitizer.$r8$lambda$NofwxHOZrEEV1MRTpUn9ROuxIY8(r2)
            return
    }
}
