package androidx.core.view;

/* JADX INFO: compiled from: View.kt */
/* JADX INFO: loaded from: classes3.dex */
@kotlin.Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
public /* synthetic */ class ViewKt$ancestors$1 extends kotlin.jvm.internal.FunctionReferenceImpl implements kotlin.jvm.functions.Function1<android.view.ViewParent, android.view.ViewParent> {
    public static final androidx.core.view.ViewKt$ancestors$1 INSTANCE = null;

    static {
            androidx.core.view.ViewKt$ancestors$1 r0 = new androidx.core.view.ViewKt$ancestors$1
            r0.<init>()
            androidx.core.view.ViewKt$ancestors$1.INSTANCE = r0
            return
    }

    public ViewKt$ancestors$1() {
            r6 = this;
            java.lang.Class<android.view.ViewParent> r2 = android.view.ViewParent.class
            r1 = 1
            java.lang.String r3 = "getParent"
            java.lang.String r4 = "getParent()Landroid/view/ViewParent;"
            r5 = 0
            r0 = r6
            r0.<init>(r1, r2, r3, r4, r5)
            return
    }

    /* JADX INFO: renamed from: invoke, reason: avoid collision after fix types in other method */
    public final android.view.ViewParent invoke2(@org.jetbrains.annotations.NotNull android.view.ViewParent r2) {
            r1 = this;
            java.lang.String r0 = "p0"
            kotlin.jvm.internal.Intrinsics.checkNotNullParameter(r2, r0)
            android.view.ViewParent r2 = r2.getParent()
            return r2
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ android.view.ViewParent invoke(android.view.ViewParent r1) {
            r0 = this;
            android.view.ViewParent r1 = (android.view.ViewParent) r1
            android.view.ViewParent r1 = r0.invoke2(r1)
            return r1
    }
}
