package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public class LeanbackTransitionHelper {
    private LeanbackTransitionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static java.lang.Object loadTitleInTransition(android.content.Context r1) {
            int r0 = androidx.leanback.R.transition.lb_title_in
            java.lang.Object r1 = androidx.leanback.transition.TransitionHelper.loadTransition(r1, r0)
            return r1
    }

    public static java.lang.Object loadTitleOutTransition(android.content.Context r1) {
            int r0 = androidx.leanback.R.transition.lb_title_out
            java.lang.Object r1 = androidx.leanback.transition.TransitionHelper.loadTransition(r1, r0)
            return r1
    }
}
