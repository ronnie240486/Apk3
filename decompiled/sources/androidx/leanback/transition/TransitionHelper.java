package androidx.leanback.transition;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
public final class TransitionHelper {
    public static final int FADE_IN = 1;
    public static final int FADE_OUT = 2;



    /* JADX INFO: loaded from: classes.dex */
    public static class TransitionStub {
        public TransitionStub() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    private TransitionHelper() {
            r0 = this;
            r0.<init>()
            return
    }

    public static void addSharedElement(android.app.FragmentTransaction r0, android.view.View r1, java.lang.String r2) {
            r0.addSharedElement(r1, r2)
            return
    }

    public static void addTarget(java.lang.Object r0, android.view.View r1) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.addTarget(r1)
            return
    }

    public static void addTransition(java.lang.Object r0, java.lang.Object r1) {
            android.transition.TransitionSet r0 = (android.transition.TransitionSet) r0
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.addTransition(r1)
            return
    }

    public static void addTransitionListener(java.lang.Object r1, androidx.leanback.transition.TransitionListener r2) {
            if (r2 != 0) goto L3
            return
        L3:
            android.transition.Transition r1 = (android.transition.Transition) r1
            androidx.leanback.transition.TransitionHelper$1 r0 = new androidx.leanback.transition.TransitionHelper$1
            r0.<init>(r2)
            r2.mImpl = r0
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.addListener(r0)
            return
    }

    public static void beginDelayedTransition(android.view.ViewGroup r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.TransitionManager.beginDelayedTransition(r0, r1)
            return
    }

    public static java.lang.Object createAutoTransition() {
            android.transition.AutoTransition r0 = new android.transition.AutoTransition
            r0.<init>()
            return r0
    }

    public static java.lang.Object createChangeBounds(boolean r1) {
            androidx.leanback.transition.CustomChangeBounds r0 = new androidx.leanback.transition.CustomChangeBounds
            r0.<init>()
            r0.setReparent(r1)
            return r0
    }

    public static java.lang.Object createChangeTransform() {
            android.transition.ChangeTransform r0 = new android.transition.ChangeTransform
            r0.<init>()
            return r0
    }

    public static java.lang.Object createDefaultInterpolator(android.content.Context r1) {
            r0 = 17563663(0x10c000f, float:2.571398E-38)
            android.view.animation.Interpolator r1 = android.view.animation.AnimationUtils.loadInterpolator(r1, r0)
            return r1
    }

    public static java.lang.Object createFadeAndShortSlide(int r1) {
            androidx.leanback.transition.FadeAndShortSlide r0 = new androidx.leanback.transition.FadeAndShortSlide
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Object createFadeAndShortSlide(int r1, float r2) {
            androidx.leanback.transition.FadeAndShortSlide r0 = new androidx.leanback.transition.FadeAndShortSlide
            r0.<init>(r1)
            r0.setDistance(r2)
            return r0
    }

    public static java.lang.Object createFadeTransition(int r1) {
            android.transition.Fade r0 = new android.transition.Fade
            r0.<init>(r1)
            return r0
    }

    public static java.lang.Object createScale() {
            android.transition.ChangeTransform r0 = new android.transition.ChangeTransform
            r0.<init>()
            return r0
    }

    public static java.lang.Object createScene(android.view.ViewGroup r1, java.lang.Runnable r2) {
            android.transition.Scene r0 = new android.transition.Scene
            r0.<init>(r1)
            r0.setEnterAction(r2)
            return r0
    }

    public static java.lang.Object createSlide(int r1) {
            androidx.leanback.transition.SlideKitkat r0 = new androidx.leanback.transition.SlideKitkat
            r0.<init>()
            r0.setSlideEdge(r1)
            return r0
    }

    public static java.lang.Object createTransitionSet(boolean r1) {
            android.transition.TransitionSet r0 = new android.transition.TransitionSet
            r0.<init>()
            r0.setOrdering(r1)
            return r0
    }

    public static void exclude(java.lang.Object r0, int r1, boolean r2) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.excludeTarget(r1, r2)
            return
    }

    public static void exclude(java.lang.Object r0, android.view.View r1, boolean r2) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.excludeTarget(r1, r2)
            return
    }

    public static void excludeChildren(java.lang.Object r0, int r1, boolean r2) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.excludeChildren(r1, r2)
            return
    }

    public static void excludeChildren(java.lang.Object r0, android.view.View r1, boolean r2) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.excludeChildren(r1, r2)
            return
    }

    public static java.lang.Object getEnterTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getEnterTransition()
            return r0
    }

    public static java.lang.Object getExitTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getExitTransition()
            return r0
    }

    public static java.lang.Object getReenterTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getReenterTransition()
            return r0
    }

    public static java.lang.Object getReturnTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getReturnTransition()
            return r0
    }

    public static java.lang.Object getSharedElementEnterTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getSharedElementEnterTransition()
            return r0
    }

    public static java.lang.Object getSharedElementExitTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getSharedElementExitTransition()
            return r0
    }

    public static java.lang.Object getSharedElementReenterTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getSharedElementReenterTransition()
            return r0
    }

    public static java.lang.Object getSharedElementReturnTransition(android.view.Window r0) {
            android.transition.Transition r0 = r0.getSharedElementReturnTransition()
            return r0
    }

    public static void include(java.lang.Object r0, int r1) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.addTarget(r1)
            return
    }

    public static void include(java.lang.Object r0, android.view.View r1) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.addTarget(r1)
            return
    }

    public static java.lang.Object loadTransition(android.content.Context r0, int r1) {
            android.transition.TransitionInflater r0 = android.transition.TransitionInflater.from(r0)
            android.transition.Transition r0 = r0.inflateTransition(r1)
            return r0
    }

    public static void removeTransitionListener(java.lang.Object r1, androidx.leanback.transition.TransitionListener r2) {
            if (r2 == 0) goto L11
            java.lang.Object r0 = r2.mImpl
            if (r0 != 0) goto L7
            goto L11
        L7:
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.Transition$TransitionListener r0 = (android.transition.Transition.TransitionListener) r0
            r1.removeListener(r0)
            r1 = 0
            r2.mImpl = r1
        L11:
            return
    }

    public static void runTransition(java.lang.Object r0, java.lang.Object r1) {
            android.transition.Scene r0 = (android.transition.Scene) r0
            android.transition.Transition r1 = (android.transition.Transition) r1
            android.transition.TransitionManager.go(r0, r1)
            return
    }

    public static void setChangeBoundsDefaultStartDelay(java.lang.Object r0, int r1) {
            androidx.leanback.transition.CustomChangeBounds r0 = (androidx.leanback.transition.CustomChangeBounds) r0
            r0.setDefaultStartDelay(r1)
            return
    }

    public static void setChangeBoundsStartDelay(java.lang.Object r0, int r1, int r2) {
            androidx.leanback.transition.CustomChangeBounds r0 = (androidx.leanback.transition.CustomChangeBounds) r0
            r0.setStartDelay(r1, r2)
            return
    }

    public static void setChangeBoundsStartDelay(java.lang.Object r0, android.view.View r1, int r2) {
            androidx.leanback.transition.CustomChangeBounds r0 = (androidx.leanback.transition.CustomChangeBounds) r0
            r0.setStartDelay(r1, r2)
            return
    }

    public static void setChangeBoundsStartDelay(java.lang.Object r0, java.lang.String r1, int r2) {
            androidx.leanback.transition.CustomChangeBounds r0 = (androidx.leanback.transition.CustomChangeBounds) r0
            r0.setStartDelay(r1, r2)
            return
    }

    public static void setDuration(java.lang.Object r0, long r1) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.setDuration(r1)
            return
    }

    public static void setEnterTransition(android.app.Fragment r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setEnterTransition(r1)
            return
    }

    public static void setEnterTransition(android.view.Window r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setEnterTransition(r1)
            return
    }

    public static void setEpicenterCallback(java.lang.Object r1, androidx.leanback.transition.TransitionEpicenterCallback r2) {
            if (r2 != 0) goto L9
            android.transition.Transition r1 = (android.transition.Transition) r1
            r2 = 0
            r1.setEpicenterCallback(r2)
            goto L13
        L9:
            android.transition.Transition r1 = (android.transition.Transition) r1
            androidx.leanback.transition.TransitionHelper$2 r0 = new androidx.leanback.transition.TransitionHelper$2
            r0.<init>(r2)
            r1.setEpicenterCallback(r0)
        L13:
            return
    }

    public static void setExitTransition(android.app.Fragment r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setExitTransition(r1)
            return
    }

    public static void setInterpolator(java.lang.Object r0, java.lang.Object r1) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            android.animation.TimeInterpolator r1 = (android.animation.TimeInterpolator) r1
            r0.setInterpolator(r1)
            return
    }

    public static void setReturnTransition(android.view.Window r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setReturnTransition(r1)
            return
    }

    public static void setSharedElementEnterTransition(android.app.Fragment r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setSharedElementEnterTransition(r1)
            return
    }

    public static void setSharedElementEnterTransition(android.view.Window r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setSharedElementEnterTransition(r1)
            return
    }

    public static void setSharedElementReturnTransition(android.view.Window r0, java.lang.Object r1) {
            android.transition.Transition r1 = (android.transition.Transition) r1
            r0.setSharedElementReturnTransition(r1)
            return
    }

    public static void setStartDelay(java.lang.Object r0, long r1) {
            android.transition.Transition r0 = (android.transition.Transition) r0
            r0.setStartDelay(r1)
            return
    }

    public static void setTransitionGroup(android.view.ViewGroup r0, boolean r1) {
            r0.setTransitionGroup(r1)
            return
    }

    public static boolean systemSupportsEntranceTransitions() {
            r0 = 1
            return r0
    }
}
