package androidx.core.util;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class Predicate$$ExternalSyntheticLambda1 implements androidx.core.util.Predicate {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ Predicate$$ExternalSyntheticLambda1(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ androidx.core.util.Predicate and(androidx.core.util.Predicate r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$and(r1, r2)
            return r2
        Lb:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$and(r1, r2)
            return r2
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ androidx.core.util.Predicate negate() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            androidx.core.util.Predicate r0 = androidx.core.util.Predicate.CC.$default$negate(r1)
            return r0
        Lb:
            androidx.core.util.Predicate r0 = androidx.core.util.Predicate.CC.$default$negate(r1)
            return r0
    }

    @Override // androidx.core.util.Predicate
    public final /* synthetic */ androidx.core.util.Predicate or(androidx.core.util.Predicate r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lb
        L6:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$or(r1, r2)
            return r2
        Lb:
            androidx.core.util.Predicate r2 = androidx.core.util.Predicate.CC.$default$or(r1, r2)
            return r2
    }

    @Override // androidx.core.util.Predicate
    public final boolean test(java.lang.Object r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Ld
        L6:
            java.lang.Object r0 = r1.f$0
            boolean r2 = androidx.core.util.Predicate.CC.lambda$isEqual$4(r0, r2)
            return r2
        Ld:
            java.lang.Object r0 = r1.f$0
            androidx.core.util.Predicate r0 = (androidx.core.util.Predicate) r0
            boolean r2 = androidx.core.util.Predicate.CC.$private$lambda$negate$1(r0, r2)
            return r2
    }
}
