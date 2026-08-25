package androidx.appcompat.widget;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class Toolbar$$ExternalSyntheticLambda0 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ androidx.appcompat.widget.Toolbar f$0;

    public /* synthetic */ Toolbar$$ExternalSyntheticLambda0(androidx.appcompat.widget.Toolbar r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Lc
        L6:
            androidx.appcompat.widget.Toolbar r0 = r1.f$0
            r0.invalidateMenu()
            return
        Lc:
            androidx.appcompat.widget.Toolbar r0 = r1.f$0
            r0.collapseActionView()
            return
    }
}
