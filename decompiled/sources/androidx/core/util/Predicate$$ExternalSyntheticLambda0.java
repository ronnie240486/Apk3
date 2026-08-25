package androidx.core.util;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda0 implements androidx.core.util.Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.core.util.Predicate f$0;
    public final /* synthetic */ java.lang.Object f$1;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda0(androidx.core.util.Predicate r1, androidx.core.util.Predicate r2, int r3) {
            r0 = this;
            r0.$r8$classId = r3
            r0.f$0 = r1
            r0.f$1 = r2
            r0.<init>()
            return
    }

    public /* synthetic */ Predicate$$ExternalSyntheticLambda0(java.lang.Class r2, androidx.core.util.Predicate r3) {
            r1 = this;
            r0 = 2
            r1.$r8$classId = r0
            r1.<init>()
            r1.f$1 = r2
            r1.f$0 = r3
            return
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$and(r1, r2)
            return r2
        Lb:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$and(r1, r2)
            return r2
        L10:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$and(r1, r2)
            return r2
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ androidx.core.util.Predicate negate() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            androidx.core.util.Predicate r0 = androidx.core.util.Predicate.CC.$default$negate(r1)
            return r0
        Lb:
            androidx.core.util.Predicate r0 = androidx.core.util.Predicate.CC.$default$negate(r1)
            return r0
        L10:
            androidx.core.util.Predicate r0 = androidx.core.util.Predicate.CC.$default$negate(r1)
            return r0
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lb;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L10
        L6:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$or(r1, r2)
            return r2
        Lb:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$or(r1, r2)
            return r2
        L10:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$or(r1, r2)
            return r2
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(java.lang.Object r3) {
            r2 = this;
            int r0 = r2.$r8$classId
            switch(r0) {
                case 0: goto L11;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L1c
        L6:
            androidx.core.util.Predicate r0 = r2.f$0
            java.lang.Object r1 = r2.f$1
            androidx.core.util.Predicate r1 = (androidx.core.util.Predicate) r1
            boolean r3 = androidx.core.util.Predicate.CC.$private$lambda$and$0(r0, r1, r3)
            return r3
        L11:
            androidx.core.util.Predicate r0 = r2.f$0
            java.lang.Object r1 = r2.f$1
            androidx.core.util.Predicate r1 = (androidx.core.util.Predicate) r1
            boolean r3 = androidx.core.util.Predicate.CC.$private$lambda$or$2(r0, r1, r3)
            return r3
        L1c:
            java.lang.Object r0 = r2.f$1
            java.lang.Class r0 = (java.lang.Class) r0
            androidx.core.util.Predicate r1 = r2.f$0
            boolean r3 = androidx.core.content.IntentSanitizer.Builder.$r8$lambda$mjBYkmM8ToC_lDxhzbaIvMBaWXI(r0, r1, r3)
            return r3
    }
}
