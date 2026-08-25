package androidx.transition;

/* JADX INFO: loaded from: classes2.dex */
@android.annotation.SuppressLint({"InlinedApi"})
class Styleable {

    @androidx.annotation.StyleableRes
    public static final int[] ARC_MOTION = null;

    @androidx.annotation.StyleableRes
    public static final int[] CHANGE_BOUNDS = null;

    @androidx.annotation.StyleableRes
    public static final int[] CHANGE_TRANSFORM = null;

    @androidx.annotation.StyleableRes
    public static final int[] FADE = null;

    @androidx.annotation.StyleableRes
    public static final int[] PATTERN_PATH_MOTION = null;

    @androidx.annotation.StyleableRes
    public static final int[] SLIDE = null;

    @androidx.annotation.StyleableRes
    public static final int[] TRANSITION = null;

    @androidx.annotation.StyleableRes
    public static final int[] TRANSITION_MANAGER = null;

    @androidx.annotation.StyleableRes
    public static final int[] TRANSITION_SET = null;

    @androidx.annotation.StyleableRes
    public static final int[] TRANSITION_TARGET = null;

    @androidx.annotation.StyleableRes
    public static final int[] VISIBILITY_TRANSITION = null;

    /* JADX INFO: loaded from: classes.dex */
    public interface ArcMotion {

        @androidx.annotation.StyleableRes
        public static final int MAXIMUM_ANGLE = 2;

        @androidx.annotation.StyleableRes
        public static final int MINIMUM_HORIZONTAL_ANGLE = 0;

        @androidx.annotation.StyleableRes
        public static final int MINIMUM_VERTICAL_ANGLE = 1;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface ChangeBounds {

        @androidx.annotation.StyleableRes
        public static final int RESIZE_CLIP = 0;
    }

    public interface ChangeTransform {

        @androidx.annotation.StyleableRes
        public static final int REPARENT = 0;

        @androidx.annotation.StyleableRes
        public static final int REPARENT_WITH_OVERLAY = 1;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Fade {

        @androidx.annotation.StyleableRes
        public static final int FADING_MODE = 0;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface PatternPathMotion {

        @androidx.annotation.StyleableRes
        public static final int PATTERN_PATH_DATA = 0;
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface Slide {

        @androidx.annotation.StyleableRes
        public static final int SLIDE_EDGE = 0;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface Transition {

        @androidx.annotation.StyleableRes
        public static final int DURATION = 1;

        @androidx.annotation.StyleableRes
        public static final int INTERPOLATOR = 0;

        @androidx.annotation.StyleableRes
        public static final int MATCH_ORDER = 3;

        @androidx.annotation.StyleableRes
        public static final int START_DELAY = 2;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface TransitionManager {

        @androidx.annotation.StyleableRes
        public static final int FROM_SCENE = 0;

        @androidx.annotation.StyleableRes
        public static final int TO_SCENE = 1;

        @androidx.annotation.StyleableRes
        public static final int TRANSITION = 2;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface TransitionSet {

        @androidx.annotation.StyleableRes
        public static final int TRANSITION_ORDERING = 0;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface TransitionTarget {

        @androidx.annotation.StyleableRes
        public static final int EXCLUDE_CLASS = 3;

        @androidx.annotation.StyleableRes
        public static final int EXCLUDE_ID = 2;

        @androidx.annotation.StyleableRes
        public static final int EXCLUDE_NAME = 5;

        @androidx.annotation.StyleableRes
        public static final int TARGET_CLASS = 0;

        @androidx.annotation.StyleableRes
        public static final int TARGET_ID = 1;

        @androidx.annotation.StyleableRes
        public static final int TARGET_NAME = 4;
    }

    /* JADX INFO: loaded from: classes.dex */
    public interface VisibilityTransition {

        @androidx.annotation.StyleableRes
        public static final int TRANSITION_VISIBILITY_MODE = 0;
    }

    static {
            r0 = 6
            int[] r0 = new int[r0]
            r0 = {x0060: FILL_ARRAY_DATA , data: [16842799, 16843740, 16843841, 16843842, 16843853, 16843854} // fill-array
            androidx.transition.Styleable.TRANSITION_TARGET = r0
            r0 = 3
            int[] r1 = new int[r0]
            r1 = {x0070: FILL_ARRAY_DATA , data: [16843741, 16843742, 16843743} // fill-array
            androidx.transition.Styleable.TRANSITION_MANAGER = r1
            r1 = 4
            int[] r1 = new int[r1]
            r1 = {x007a: FILL_ARRAY_DATA , data: [16843073, 16843160, 16843746, 16843855} // fill-array
            androidx.transition.Styleable.TRANSITION = r1
            r1 = 1
            int[] r2 = new int[r1]
            r3 = 16843983(0x10104cf, float:2.3697008E-38)
            r4 = 0
            r2[r4] = r3
            androidx.transition.Styleable.CHANGE_BOUNDS = r2
            int[] r2 = new int[r1]
            r3 = 16843900(0x101047c, float:2.3696775E-38)
            r2[r4] = r3
            androidx.transition.Styleable.VISIBILITY_TRANSITION = r2
            int[] r2 = new int[r1]
            r3 = 16843745(0x10103e1, float:2.369634E-38)
            r2[r4] = r3
            androidx.transition.Styleable.FADE = r2
            r2 = 2
            int[] r2 = new int[r2]
            r2 = {x0086: FILL_ARRAY_DATA , data: [16843964, 16843965} // fill-array
            androidx.transition.Styleable.CHANGE_TRANSFORM = r2
            int[] r2 = new int[r1]
            r3 = 16843824(0x1010430, float:2.3696562E-38)
            r2[r4] = r3
            androidx.transition.Styleable.SLIDE = r2
            int[] r2 = new int[r1]
            r3 = 16843744(0x10103e0, float:2.3696338E-38)
            r2[r4] = r3
            androidx.transition.Styleable.TRANSITION_SET = r2
            int[] r0 = new int[r0]
            r0 = {x008e: FILL_ARRAY_DATA , data: [16843901, 16843902, 16843903} // fill-array
            androidx.transition.Styleable.ARC_MOTION = r0
            int[] r0 = new int[r1]
            r1 = 16843978(0x10104ca, float:2.3696994E-38)
            r0[r4] = r1
            androidx.transition.Styleable.PATTERN_PATH_MOTION = r0
            return
    }

    private Styleable() {
            r0 = this;
            r0.<init>()
            return
    }
}
