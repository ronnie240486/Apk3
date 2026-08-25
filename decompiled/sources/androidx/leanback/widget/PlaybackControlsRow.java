package androidx.leanback.widget;

/* JADX INFO: loaded from: classes3.dex */
public class PlaybackControlsRow extends androidx.leanback.widget.Row {
    private long mBufferedProgressMs;
    private long mCurrentTimeMs;
    private android.graphics.drawable.Drawable mImageDrawable;
    private java.lang.Object mItem;
    private androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback mListener;
    private androidx.leanback.widget.ObjectAdapter mPrimaryActionsAdapter;
    private androidx.leanback.widget.ObjectAdapter mSecondaryActionsAdapter;
    private long mTotalTimeMs;

    /* JADX INFO: loaded from: classes2.dex */
    public static class ClosedCaptioningAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public static final int INDEX_OFF = 0;
        public static final int INDEX_ON = 1;

        @java.lang.Deprecated
        public static final int OFF = 0;

        @java.lang.Deprecated
        public static final int ON = 1;

        public ClosedCaptioningAction(android.content.Context r2) {
                r1 = this;
                int r0 = androidx.leanback.widget.PlaybackControlsRow.getIconHighlightColor(r2)
                r1.<init>(r2, r0)
                return
        }

        public ClosedCaptioningAction(android.content.Context r7, int r8) {
                r6 = this;
                int r0 = androidx.leanback.R.id.lb_control_closed_captioning
                r6.<init>(r0)
                int r0 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_closed_captioning
                android.graphics.drawable.Drawable r0 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r7, r0)
                android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
                r1 = 2
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r1]
                r3 = 0
                r2[r3] = r0
                android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r5 = r7.getResources()
                android.graphics.Bitmap r0 = r0.getBitmap()
                android.graphics.Bitmap r8 = androidx.leanback.widget.PlaybackControlsRow.createBitmap(r0, r8)
                r4.<init>(r5, r8)
                r8 = 1
                r2[r8] = r4
                r6.setDrawables(r2)
                java.lang.String[] r0 = new java.lang.String[r1]
                int r1 = androidx.leanback.R.string.lb_playback_controls_closed_captioning_enable
                java.lang.String r1 = r7.getString(r1)
                r0[r3] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_closed_captioning_disable
                java.lang.String r7 = r7.getString(r1)
                r0[r8] = r7
                r6.setLabels(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class FastForwardAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public FastForwardAction(android.content.Context r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public FastForwardAction(android.content.Context r11, int r12) {
                r10 = this;
                int r0 = androidx.leanback.R.id.lb_control_fast_forward
                r10.<init>(r0)
                r0 = 1
                if (r12 < r0) goto L6b
                int r1 = r12 + 1
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_fast_forward
                android.graphics.drawable.Drawable r2 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r11, r2)
                r3 = 0
                r1[r3] = r2
                r10.setDrawables(r1)
                int r1 = r10.getActionCount()
                java.lang.String[] r1 = new java.lang.String[r1]
                int r2 = androidx.leanback.R.string.lb_playback_controls_fast_forward
                java.lang.String r2 = r11.getString(r2)
                r1[r3] = r2
                int r2 = r10.getActionCount()
                java.lang.String[] r2 = new java.lang.String[r2]
                r4 = r1[r3]
                r2[r3] = r4
                r4 = 1
            L31:
                if (r4 > r12) goto L5f
                int r5 = r4 + 1
                android.content.res.Resources r6 = r11.getResources()
                int r7 = androidx.leanback.R.string.lb_control_display_fast_forward_multiplier
                java.lang.Object[] r8 = new java.lang.Object[r0]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                r8[r3] = r9
                java.lang.String r6 = r6.getString(r7, r8)
                r1[r4] = r6
                android.content.res.Resources r6 = r11.getResources()
                int r7 = androidx.leanback.R.string.lb_playback_controls_fast_forward_multiplier
                java.lang.Object[] r8 = new java.lang.Object[r0]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                r8[r3] = r9
                java.lang.String r6 = r6.getString(r7, r8)
                r2[r4] = r6
                r4 = r5
                goto L31
            L5f:
                r10.setLabels(r1)
                r10.setSecondaryLabels(r2)
                r11 = 90
                r10.addKeyCode(r11)
                return
            L6b:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r12 = "numSpeeds must be > 0"
                r11.<init>(r12)
                throw r11
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class HighQualityAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public static final int INDEX_OFF = 0;
        public static final int INDEX_ON = 1;

        @java.lang.Deprecated
        public static final int OFF = 0;

        @java.lang.Deprecated
        public static final int ON = 1;

        public HighQualityAction(android.content.Context r2) {
                r1 = this;
                int r0 = androidx.leanback.widget.PlaybackControlsRow.getIconHighlightColor(r2)
                r1.<init>(r2, r0)
                return
        }

        public HighQualityAction(android.content.Context r7, int r8) {
                r6 = this;
                int r0 = androidx.leanback.R.id.lb_control_high_quality
                r6.<init>(r0)
                int r0 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_high_quality
                android.graphics.drawable.Drawable r0 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r7, r0)
                android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
                r1 = 2
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r1]
                r3 = 0
                r2[r3] = r0
                android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r5 = r7.getResources()
                android.graphics.Bitmap r0 = r0.getBitmap()
                android.graphics.Bitmap r8 = androidx.leanback.widget.PlaybackControlsRow.createBitmap(r0, r8)
                r4.<init>(r5, r8)
                r8 = 1
                r2[r8] = r4
                r6.setDrawables(r2)
                java.lang.String[] r0 = new java.lang.String[r1]
                int r1 = androidx.leanback.R.string.lb_playback_controls_high_quality_enable
                java.lang.String r1 = r7.getString(r1)
                r0[r3] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_high_quality_disable
                java.lang.String r7 = r7.getString(r1)
                r0[r8] = r7
                r6.setLabels(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class MoreActions extends androidx.leanback.widget.Action {
        public MoreActions(android.content.Context r3) {
                r2 = this;
                int r0 = androidx.leanback.R.id.lb_control_more_actions
                long r0 = (long) r0
                r2.<init>(r0)
                android.content.res.Resources r0 = r3.getResources()
                int r1 = androidx.leanback.R.drawable.lb_ic_more
                android.graphics.drawable.Drawable r0 = r0.getDrawable(r1)
                r2.setIcon(r0)
                int r0 = androidx.leanback.R.string.lb_playback_controls_more_actions
                java.lang.String r3 = r3.getString(r0)
                r2.setLabel1(r3)
                return
        }
    }

    public static abstract class MultiAction extends androidx.leanback.widget.Action {
        private android.graphics.drawable.Drawable[] mDrawables;
        private int mIndex;
        private java.lang.String[] mLabels;
        private java.lang.String[] mLabels2;

        public MultiAction(int r3) {
                r2 = this;
                long r0 = (long) r3
                r2.<init>(r0)
                return
        }

        public int getActionCount() {
                r1 = this;
                android.graphics.drawable.Drawable[] r0 = r1.mDrawables
                if (r0 == 0) goto L6
                int r0 = r0.length
                return r0
            L6:
                java.lang.String[] r0 = r1.mLabels
                if (r0 == 0) goto Lc
                int r0 = r0.length
                return r0
            Lc:
                r0 = 0
                return r0
        }

        public android.graphics.drawable.Drawable getDrawable(int r2) {
                r1 = this;
                android.graphics.drawable.Drawable[] r0 = r1.mDrawables
                if (r0 != 0) goto L6
                r2 = 0
                goto L8
            L6:
                r2 = r0[r2]
            L8:
                return r2
        }

        public int getIndex() {
                r1 = this;
                int r0 = r1.mIndex
                return r0
        }

        public java.lang.String getLabel(int r2) {
                r1 = this;
                java.lang.String[] r0 = r1.mLabels
                if (r0 != 0) goto L6
                r2 = 0
                goto L8
            L6:
                r2 = r0[r2]
            L8:
                return r2
        }

        public java.lang.String getSecondaryLabel(int r2) {
                r1 = this;
                java.lang.String[] r0 = r1.mLabels2
                if (r0 != 0) goto L6
                r2 = 0
                goto L8
            L6:
                r2 = r0[r2]
            L8:
                return r2
        }

        public void nextIndex() {
                r2 = this;
                int r0 = r2.mIndex
                int r1 = r2.getActionCount()
                int r1 = r1 + (-1)
                if (r0 >= r1) goto Lf
                int r0 = r2.mIndex
                int r0 = r0 + 1
                goto L10
            Lf:
                r0 = 0
            L10:
                r2.setIndex(r0)
                return
        }

        public void setDrawables(android.graphics.drawable.Drawable[] r1) {
                r0 = this;
                r0.mDrawables = r1
                r1 = 0
                r0.setIndex(r1)
                return
        }

        public void setIndex(int r2) {
                r1 = this;
                r1.mIndex = r2
                android.graphics.drawable.Drawable[] r0 = r1.mDrawables
                if (r0 == 0) goto Lb
                r2 = r0[r2]
                r1.setIcon(r2)
            Lb:
                java.lang.String[] r2 = r1.mLabels
                if (r2 == 0) goto L16
                int r0 = r1.mIndex
                r2 = r2[r0]
                r1.setLabel1(r2)
            L16:
                java.lang.String[] r2 = r1.mLabels2
                if (r2 == 0) goto L21
                int r0 = r1.mIndex
                r2 = r2[r0]
                r1.setLabel2(r2)
            L21:
                return
        }

        public void setLabels(java.lang.String[] r1) {
                r0 = this;
                r0.mLabels = r1
                r1 = 0
                r0.setIndex(r1)
                return
        }

        public void setSecondaryLabels(java.lang.String[] r1) {
                r0 = this;
                r0.mLabels2 = r1
                r1 = 0
                r0.setIndex(r1)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class OnPlaybackProgressCallback {
        public OnPlaybackProgressCallback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onBufferedPositionChanged(androidx.leanback.widget.PlaybackControlsRow r1, long r2) {
                r0 = this;
                return
        }

        public void onCurrentPositionChanged(androidx.leanback.widget.PlaybackControlsRow r1, long r2) {
                r0 = this;
                return
        }

        public void onDurationChanged(androidx.leanback.widget.PlaybackControlsRow r1, long r2) {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class PictureInPictureAction extends androidx.leanback.widget.Action {
        public PictureInPictureAction(android.content.Context r3) {
                r2 = this;
                int r0 = androidx.leanback.R.id.lb_control_picture_in_picture
                long r0 = (long) r0
                r2.<init>(r0)
                int r0 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_picture_in_picture
                android.graphics.drawable.Drawable r0 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r3, r0)
                r2.setIcon(r0)
                int r0 = androidx.leanback.R.string.lb_playback_controls_picture_in_picture
                java.lang.String r3 = r3.getString(r0)
                r2.setLabel1(r3)
                r3 = 171(0xab, float:2.4E-43)
                r2.addKeyCode(r3)
                return
        }
    }

    public static class PlayPauseAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public static final int INDEX_PAUSE = 1;
        public static final int INDEX_PLAY = 0;

        @java.lang.Deprecated
        public static final int PAUSE = 1;

        @java.lang.Deprecated
        public static final int PLAY = 0;

        public PlayPauseAction(android.content.Context r6) {
                r5 = this;
                int r0 = androidx.leanback.R.id.lb_control_play_pause
                r5.<init>(r0)
                r0 = 2
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_play
                android.graphics.drawable.Drawable r2 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r6, r2)
                r3 = 0
                r1[r3] = r2
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_pause
                android.graphics.drawable.Drawable r2 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r6, r2)
                r4 = 1
                r1[r4] = r2
                r5.setDrawables(r1)
                java.lang.String[] r0 = new java.lang.String[r0]
                int r1 = androidx.leanback.R.string.lb_playback_controls_play
                java.lang.String r1 = r6.getString(r1)
                r0[r3] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_pause
                java.lang.String r6 = r6.getString(r1)
                r0[r4] = r6
                r5.setLabels(r0)
                r6 = 85
                r5.addKeyCode(r6)
                r6 = 126(0x7e, float:1.77E-43)
                r5.addKeyCode(r6)
                r6 = 127(0x7f, float:1.78E-43)
                r5.addKeyCode(r6)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RepeatAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {

        @java.lang.Deprecated
        public static final int ALL = 1;
        public static final int INDEX_ALL = 1;
        public static final int INDEX_NONE = 0;
        public static final int INDEX_ONE = 2;

        @java.lang.Deprecated
        public static final int NONE = 0;

        @java.lang.Deprecated
        public static final int ONE = 2;

        public RepeatAction(android.content.Context r2) {
                r1 = this;
                int r0 = androidx.leanback.widget.PlaybackControlsRow.getIconHighlightColor(r2)
                r1.<init>(r2, r0)
                return
        }

        public RepeatAction(android.content.Context r1, int r2) {
                r0 = this;
                r0.<init>(r1, r2, r2)
                return
        }

        public RepeatAction(android.content.Context r9, int r10, int r11) {
                r8 = this;
                int r0 = androidx.leanback.R.id.lb_control_repeat
                r8.<init>(r0)
                r0 = 3
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r0]
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_repeat
                android.graphics.drawable.Drawable r2 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r9, r2)
                android.graphics.drawable.BitmapDrawable r2 = (android.graphics.drawable.BitmapDrawable) r2
                int r3 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_repeat_one
                android.graphics.drawable.Drawable r3 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r9, r3)
                android.graphics.drawable.BitmapDrawable r3 = (android.graphics.drawable.BitmapDrawable) r3
                r4 = 0
                r1[r4] = r2
                r5 = 0
                if (r2 != 0) goto L20
                r6 = r5
                goto L31
            L20:
                android.graphics.drawable.BitmapDrawable r6 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r7 = r9.getResources()
                android.graphics.Bitmap r2 = r2.getBitmap()
                android.graphics.Bitmap r10 = androidx.leanback.widget.PlaybackControlsRow.createBitmap(r2, r10)
                r6.<init>(r7, r10)
            L31:
                r10 = 1
                r1[r10] = r6
                if (r3 != 0) goto L37
                goto L48
            L37:
                android.graphics.drawable.BitmapDrawable r5 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r2 = r9.getResources()
                android.graphics.Bitmap r3 = r3.getBitmap()
                android.graphics.Bitmap r11 = androidx.leanback.widget.PlaybackControlsRow.createBitmap(r3, r11)
                r5.<init>(r2, r11)
            L48:
                r11 = 2
                r1[r11] = r5
                r8.setDrawables(r1)
                java.lang.String[] r0 = new java.lang.String[r0]
                int r1 = androidx.leanback.R.string.lb_playback_controls_repeat_all
                java.lang.String r1 = r9.getString(r1)
                r0[r4] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_repeat_one
                java.lang.String r1 = r9.getString(r1)
                r0[r10] = r1
                int r10 = androidx.leanback.R.string.lb_playback_controls_repeat_none
                java.lang.String r9 = r9.getString(r10)
                r0[r11] = r9
                r8.setLabels(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class RewindAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public RewindAction(android.content.Context r2) {
                r1 = this;
                r0 = 1
                r1.<init>(r2, r0)
                return
        }

        public RewindAction(android.content.Context r11, int r12) {
                r10 = this;
                int r0 = androidx.leanback.R.id.lb_control_fast_rewind
                r10.<init>(r0)
                r0 = 1
                if (r12 < r0) goto L6d
                int r1 = r12 + 1
                android.graphics.drawable.Drawable[] r1 = new android.graphics.drawable.Drawable[r1]
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_rewind
                android.graphics.drawable.Drawable r2 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r11, r2)
                r3 = 0
                r1[r3] = r2
                r10.setDrawables(r1)
                int r1 = r10.getActionCount()
                java.lang.String[] r1 = new java.lang.String[r1]
                int r2 = androidx.leanback.R.string.lb_playback_controls_rewind
                java.lang.String r2 = r11.getString(r2)
                r1[r3] = r2
                int r2 = r10.getActionCount()
                java.lang.String[] r2 = new java.lang.String[r2]
                r4 = r1[r3]
                r2[r3] = r4
                r4 = 1
            L31:
                if (r4 > r12) goto L61
                int r5 = r4 + 1
                android.content.res.Resources r6 = r11.getResources()
                int r7 = androidx.leanback.R.string.lb_control_display_rewind_multiplier
                java.lang.Object[] r8 = new java.lang.Object[r0]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                r8[r3] = r9
                java.lang.String r6 = r6.getString(r7, r8)
                r1[r4] = r6
                r1[r4] = r6
                android.content.res.Resources r6 = r11.getResources()
                int r7 = androidx.leanback.R.string.lb_playback_controls_rewind_multiplier
                java.lang.Object[] r8 = new java.lang.Object[r0]
                java.lang.Integer r9 = java.lang.Integer.valueOf(r5)
                r8[r3] = r9
                java.lang.String r6 = r6.getString(r7, r8)
                r2[r4] = r6
                r4 = r5
                goto L31
            L61:
                r10.setLabels(r1)
                r10.setSecondaryLabels(r2)
                r11 = 89
                r10.addKeyCode(r11)
                return
            L6d:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r12 = "numSpeeds must be > 0"
                r11.<init>(r12)
                throw r11
        }
    }

    public static class ShuffleAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public static final int INDEX_OFF = 0;
        public static final int INDEX_ON = 1;

        @java.lang.Deprecated
        public static final int OFF = 0;

        @java.lang.Deprecated
        public static final int ON = 1;

        public ShuffleAction(android.content.Context r2) {
                r1 = this;
                int r0 = androidx.leanback.widget.PlaybackControlsRow.getIconHighlightColor(r2)
                r1.<init>(r2, r0)
                return
        }

        public ShuffleAction(android.content.Context r7, int r8) {
                r6 = this;
                int r0 = androidx.leanback.R.id.lb_control_shuffle
                r6.<init>(r0)
                int r0 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_shuffle
                android.graphics.drawable.Drawable r0 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r7, r0)
                android.graphics.drawable.BitmapDrawable r0 = (android.graphics.drawable.BitmapDrawable) r0
                r1 = 2
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r1]
                r3 = 0
                r2[r3] = r0
                android.graphics.drawable.BitmapDrawable r4 = new android.graphics.drawable.BitmapDrawable
                android.content.res.Resources r5 = r7.getResources()
                android.graphics.Bitmap r0 = r0.getBitmap()
                android.graphics.Bitmap r8 = androidx.leanback.widget.PlaybackControlsRow.createBitmap(r0, r8)
                r4.<init>(r5, r8)
                r8 = 1
                r2[r8] = r4
                r6.setDrawables(r2)
                java.lang.String[] r0 = new java.lang.String[r1]
                int r1 = androidx.leanback.R.string.lb_playback_controls_shuffle_enable
                java.lang.String r1 = r7.getString(r1)
                r0[r3] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_shuffle_disable
                java.lang.String r7 = r7.getString(r1)
                r0[r8] = r7
                r6.setLabels(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SkipNextAction extends androidx.leanback.widget.Action {
        public SkipNextAction(android.content.Context r3) {
                r2 = this;
                int r0 = androidx.leanback.R.id.lb_control_skip_next
                long r0 = (long) r0
                r2.<init>(r0)
                int r0 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_skip_next
                android.graphics.drawable.Drawable r0 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r3, r0)
                r2.setIcon(r0)
                int r0 = androidx.leanback.R.string.lb_playback_controls_skip_next
                java.lang.String r3 = r3.getString(r0)
                r2.setLabel1(r3)
                r3 = 87
                r2.addKeyCode(r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class SkipPreviousAction extends androidx.leanback.widget.Action {
        public SkipPreviousAction(android.content.Context r3) {
                r2 = this;
                int r0 = androidx.leanback.R.id.lb_control_skip_previous
                long r0 = (long) r0
                r2.<init>(r0)
                int r0 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_skip_previous
                android.graphics.drawable.Drawable r0 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r3, r0)
                r2.setIcon(r0)
                int r0 = androidx.leanback.R.string.lb_playback_controls_skip_previous
                java.lang.String r3 = r3.getString(r0)
                r2.setLabel1(r3)
                r3 = 88
                r2.addKeyCode(r3)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class ThumbsAction extends androidx.leanback.widget.PlaybackControlsRow.MultiAction {
        public static final int INDEX_OUTLINE = 1;
        public static final int INDEX_SOLID = 0;

        @java.lang.Deprecated
        public static final int OUTLINE = 1;

        @java.lang.Deprecated
        public static final int SOLID = 0;

        public ThumbsAction(int r2, android.content.Context r3, int r4, int r5) {
                r1 = this;
                r1.<init>(r2)
                r2 = 2
                android.graphics.drawable.Drawable[] r2 = new android.graphics.drawable.Drawable[r2]
                android.graphics.drawable.Drawable r4 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r3, r4)
                r0 = 0
                r2[r0] = r4
                android.graphics.drawable.Drawable r3 = androidx.leanback.widget.PlaybackControlsRow.getStyledDrawable(r3, r5)
                r4 = 1
                r2[r4] = r3
                r1.setDrawables(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ThumbsDownAction extends androidx.leanback.widget.PlaybackControlsRow.ThumbsAction {
        public ThumbsDownAction(android.content.Context r4) {
                r3 = this;
                int r0 = androidx.leanback.R.id.lb_control_thumbs_down
                int r1 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_thumb_down
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_thumb_down_outline
                r3.<init>(r0, r4, r1, r2)
                int r0 = r3.getActionCount()
                java.lang.String[] r0 = new java.lang.String[r0]
                int r1 = androidx.leanback.R.string.lb_playback_controls_thumb_down
                java.lang.String r1 = r4.getString(r1)
                r2 = 0
                r0[r2] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_thumb_down_outline
                java.lang.String r4 = r4.getString(r1)
                r1 = 1
                r0[r1] = r4
                r3.setLabels(r0)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class ThumbsUpAction extends androidx.leanback.widget.PlaybackControlsRow.ThumbsAction {
        public ThumbsUpAction(android.content.Context r4) {
                r3 = this;
                int r0 = androidx.leanback.R.id.lb_control_thumbs_up
                int r1 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_thumb_up
                int r2 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons_thumb_up_outline
                r3.<init>(r0, r4, r1, r2)
                int r0 = r3.getActionCount()
                java.lang.String[] r0 = new java.lang.String[r0]
                int r1 = androidx.leanback.R.string.lb_playback_controls_thumb_up
                java.lang.String r1 = r4.getString(r1)
                r2 = 0
                r0[r2] = r1
                int r1 = androidx.leanback.R.string.lb_playback_controls_thumb_up_outline
                java.lang.String r4 = r4.getString(r1)
                r1 = 1
                r0[r1] = r4
                r3.setLabels(r0)
                return
        }
    }

    public PlaybackControlsRow() {
            r0 = this;
            r0.<init>()
            return
    }

    public PlaybackControlsRow(java.lang.Object r1) {
            r0 = this;
            r0.<init>()
            r0.mItem = r1
            return
    }

    public static android.graphics.Bitmap createBitmap(android.graphics.Bitmap r5, int r6) {
            android.graphics.Bitmap$Config r0 = r5.getConfig()
            r1 = 1
            android.graphics.Bitmap r0 = r5.copy(r0, r1)
            android.graphics.Canvas r1 = new android.graphics.Canvas
            r1.<init>(r0)
            android.graphics.Paint r2 = new android.graphics.Paint
            r2.<init>()
            android.graphics.PorterDuffColorFilter r3 = new android.graphics.PorterDuffColorFilter
            android.graphics.PorterDuff$Mode r4 = android.graphics.PorterDuff.Mode.SRC_ATOP
            r3.<init>(r6, r4)
            r2.setColorFilter(r3)
            r6 = 0
            r1.drawBitmap(r5, r6, r6, r2)
            return r0
    }

    public static int getIconHighlightColor(android.content.Context r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.leanback.R.attr.playbackControlsIconHighlightColor
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L15
            int r4 = r0.data
            return r4
        L15:
            android.content.res.Resources r4 = r4.getResources()
            int r0 = androidx.leanback.R.color.lb_playback_icon_highlight_no_theme
            int r4 = r4.getColor(r0)
            return r4
    }

    public static android.graphics.drawable.Drawable getStyledDrawable(android.content.Context r4, int r5) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.leanback.R.attr.playbackControlsActionIcons
            r3 = 0
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 != 0) goto L14
            r4 = 0
            return r4
        L14:
            android.content.res.Resources$Theme r4 = r4.getTheme()
            int r0 = r0.data
            int[] r1 = androidx.leanback.R.styleable.lbPlaybackControlsActionIcons
            android.content.res.TypedArray r4 = r4.obtainStyledAttributes(r0, r1)
            android.graphics.drawable.Drawable r5 = r4.getDrawable(r5)
            r4.recycle()
            return r5
    }

    public androidx.leanback.widget.Action getActionForKeyCode(int r2) {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.getPrimaryActionsAdapter()
            androidx.leanback.widget.Action r0 = r1.getActionForKeyCode(r0, r2)
            if (r0 == 0) goto Lb
            return r0
        Lb:
            androidx.leanback.widget.ObjectAdapter r0 = r1.getSecondaryActionsAdapter()
            androidx.leanback.widget.Action r2 = r1.getActionForKeyCode(r0, r2)
            return r2
    }

    public androidx.leanback.widget.Action getActionForKeyCode(androidx.leanback.widget.ObjectAdapter r4, int r5) {
            r3 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r3.mPrimaryActionsAdapter
            if (r4 == r0) goto L11
            androidx.leanback.widget.ObjectAdapter r0 = r3.mSecondaryActionsAdapter
            if (r4 != r0) goto L9
            goto L11
        L9:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            java.lang.String r5 = "Invalid adapter"
            r4.<init>(r5)
            throw r4
        L11:
            r0 = 0
        L12:
            int r1 = r4.size()
            if (r0 >= r1) goto L28
            java.lang.Object r1 = r4.get(r0)
            androidx.leanback.widget.Action r1 = (androidx.leanback.widget.Action) r1
            boolean r2 = r1.respondsToKeyCode(r5)
            if (r2 == 0) goto L25
            return r1
        L25:
            int r0 = r0 + 1
            goto L12
        L28:
            r4 = 0
            return r4
    }

    public long getBufferedPosition() {
            r2 = this;
            long r0 = r2.mBufferedProgressMs
            return r0
    }

    @java.lang.Deprecated
    public int getBufferedProgress() {
            r2 = this;
            long r0 = r2.getBufferedPosition()
            int r0 = androidx.leanback.util.MathUtil.safeLongToInt(r0)
            return r0
    }

    @java.lang.Deprecated
    public long getBufferedProgressLong() {
            r2 = this;
            long r0 = r2.mBufferedProgressMs
            return r0
    }

    public long getCurrentPosition() {
            r2 = this;
            long r0 = r2.mCurrentTimeMs
            return r0
    }

    @java.lang.Deprecated
    public int getCurrentTime() {
            r2 = this;
            long r0 = r2.getCurrentTimeLong()
            int r0 = androidx.leanback.util.MathUtil.safeLongToInt(r0)
            return r0
    }

    @java.lang.Deprecated
    public long getCurrentTimeLong() {
            r2 = this;
            long r0 = r2.mCurrentTimeMs
            return r0
    }

    public long getDuration() {
            r2 = this;
            long r0 = r2.mTotalTimeMs
            return r0
    }

    public final android.graphics.drawable.Drawable getImageDrawable() {
            r1 = this;
            android.graphics.drawable.Drawable r0 = r1.mImageDrawable
            return r0
    }

    public final java.lang.Object getItem() {
            r1 = this;
            java.lang.Object r0 = r1.mItem
            return r0
    }

    public final androidx.leanback.widget.ObjectAdapter getPrimaryActionsAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mPrimaryActionsAdapter
            return r0
    }

    public final androidx.leanback.widget.ObjectAdapter getSecondaryActionsAdapter() {
            r1 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r1.mSecondaryActionsAdapter
            return r0
    }

    @java.lang.Deprecated
    public int getTotalTime() {
            r2 = this;
            long r0 = r2.getTotalTimeLong()
            int r0 = androidx.leanback.util.MathUtil.safeLongToInt(r0)
            return r0
    }

    @java.lang.Deprecated
    public long getTotalTimeLong() {
            r2 = this;
            long r0 = r2.mTotalTimeMs
            return r0
    }

    public void setBufferedPosition(long r4) {
            r3 = this;
            long r0 = r3.mBufferedProgressMs
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto Lf
            r3.mBufferedProgressMs = r4
            androidx.leanback.widget.PlaybackControlsRow$OnPlaybackProgressCallback r0 = r3.mListener
            if (r0 == 0) goto Lf
            r0.onBufferedPositionChanged(r3, r4)
        Lf:
            return
    }

    @java.lang.Deprecated
    public void setBufferedProgress(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.setBufferedPosition(r0)
            return
    }

    @java.lang.Deprecated
    public void setBufferedProgressLong(long r1) {
            r0 = this;
            r0.setBufferedPosition(r1)
            return
    }

    public void setCurrentPosition(long r4) {
            r3 = this;
            long r0 = r3.mCurrentTimeMs
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto Lf
            r3.mCurrentTimeMs = r4
            androidx.leanback.widget.PlaybackControlsRow$OnPlaybackProgressCallback r0 = r3.mListener
            if (r0 == 0) goto Lf
            r0.onCurrentPositionChanged(r3, r4)
        Lf:
            return
    }

    @java.lang.Deprecated
    public void setCurrentTime(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.setCurrentTimeLong(r0)
            return
    }

    @java.lang.Deprecated
    public void setCurrentTimeLong(long r1) {
            r0 = this;
            r0.setCurrentPosition(r1)
            return
    }

    public void setDuration(long r4) {
            r3 = this;
            long r0 = r3.mTotalTimeMs
            int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
            if (r2 == 0) goto Lf
            r3.mTotalTimeMs = r4
            androidx.leanback.widget.PlaybackControlsRow$OnPlaybackProgressCallback r0 = r3.mListener
            if (r0 == 0) goto Lf
            r0.onDurationChanged(r3, r4)
        Lf:
            return
    }

    public final void setImageBitmap(android.content.Context r2, android.graphics.Bitmap r3) {
            r1 = this;
            android.graphics.drawable.BitmapDrawable r0 = new android.graphics.drawable.BitmapDrawable
            android.content.res.Resources r2 = r2.getResources()
            r0.<init>(r2, r3)
            r1.mImageDrawable = r0
            return
    }

    public final void setImageDrawable(android.graphics.drawable.Drawable r1) {
            r0 = this;
            r0.mImageDrawable = r1
            return
    }

    public void setOnPlaybackProgressChangedListener(androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback r1) {
            r0 = this;
            r0.mListener = r1
            return
    }

    public final void setPrimaryActionsAdapter(androidx.leanback.widget.ObjectAdapter r1) {
            r0 = this;
            r0.mPrimaryActionsAdapter = r1
            return
    }

    public final void setSecondaryActionsAdapter(androidx.leanback.widget.ObjectAdapter r1) {
            r0 = this;
            r0.mSecondaryActionsAdapter = r1
            return
    }

    @java.lang.Deprecated
    public void setTotalTime(int r3) {
            r2 = this;
            long r0 = (long) r3
            r2.setDuration(r0)
            return
    }

    @java.lang.Deprecated
    public void setTotalTimeLong(long r1) {
            r0 = this;
            r0.setDuration(r1)
            return
    }
}
