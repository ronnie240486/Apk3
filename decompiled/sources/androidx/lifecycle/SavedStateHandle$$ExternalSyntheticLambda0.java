package androidx.lifecycle;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class SavedStateHandle$$ExternalSyntheticLambda0 implements androidx.savedstate.SavedStateRegistry.SavedStateProvider {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ SavedStateHandle$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // androidx.savedstate.SavedStateRegistry.SavedStateProvider
    public final android.os.Bundle saveState() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Lf;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L18
        L6:
            java.lang.Object r0 = r1.f$0
            androidx.lifecycle.SavedStateHandle r0 = (androidx.lifecycle.SavedStateHandle) r0
            android.os.Bundle r0 = androidx.lifecycle.SavedStateHandle.$r8$lambda$85q68529u9GpNelrug3JBSyWf4c(r0)
            return r0
        Lf:
            java.lang.Object r0 = r1.f$0
            androidx.lifecycle.SavedStateHandle r0 = (androidx.lifecycle.SavedStateHandle) r0
            android.os.Bundle r0 = androidx.lifecycle.SavedStateHandle.$r8$lambda$85q68529u9GpNelrug3JBSyWf4c(r0)
            return r0
        L18:
            java.lang.Object r0 = r1.f$0
            androidx.activity.ComponentActivity r0 = (androidx.activity.ComponentActivity) r0
            android.os.Bundle r0 = androidx.activity.ComponentActivity.$r8$lambda$uMG6y9sMaPUFZmnRrSgWpORKiAI(r0)
            return r0
    }
}
