package androidx.leanback.widget;

/* JADX INFO: loaded from: classes2.dex */
public class PlaybackTransportRowPresenter extends androidx.leanback.widget.PlaybackRowPresenter {
    public float mDefaultSeekIncrement;
    public androidx.leanback.widget.Presenter mDescriptionPresenter;
    public androidx.leanback.widget.OnActionClickedListener mOnActionClickedListener;
    private final androidx.leanback.widget.ControlBarPresenter.OnControlClickedListener mOnControlClickedListener;
    private final androidx.leanback.widget.ControlBarPresenter.OnControlSelectedListener mOnControlSelectedListener;
    public androidx.leanback.widget.ControlBarPresenter mPlaybackControlsPresenter;
    public int mProgressColor;
    public boolean mProgressColorSet;
    public androidx.leanback.widget.ControlBarPresenter mSecondaryControlsPresenter;
    public int mSecondaryProgressColor;
    public boolean mSecondaryProgressColorSet;




    /* JADX INFO: loaded from: classes3.dex */
    public static class BoundData extends androidx.leanback.widget.PlaybackControlsPresenter.BoundData {
        public androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder mRowViewHolder;

        public BoundData() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    public class ViewHolder extends androidx.leanback.widget.PlaybackRowPresenter.ViewHolder implements androidx.leanback.widget.PlaybackSeekUi {
        public androidx.leanback.widget.PlaybackTransportRowPresenter.BoundData mControlsBoundData;
        public final android.view.ViewGroup mControlsDock;
        public androidx.leanback.widget.ControlBarPresenter.ViewHolder mControlsVh;
        public final android.widget.TextView mCurrentTime;
        public long mCurrentTimeInMs;
        public final android.view.ViewGroup mDescriptionDock;
        public final androidx.leanback.widget.Presenter.ViewHolder mDescriptionViewHolder;
        public final android.widget.ImageView mImageView;
        public boolean mInSeek;
        public final androidx.leanback.widget.PlaybackControlsRow.OnPlaybackProgressCallback mListener;
        public androidx.leanback.widget.PlaybackControlsRow.PlayPauseAction mPlayPauseAction;
        public long[] mPositions;
        public int mPositionsLength;
        public final androidx.leanback.widget.SeekBar mProgressBar;
        public androidx.leanback.widget.PlaybackTransportRowPresenter.BoundData mSecondaryBoundData;
        public final android.view.ViewGroup mSecondaryControlsDock;
        public androidx.leanback.widget.ControlBarPresenter.ViewHolder mSecondaryControlsVh;
        public androidx.leanback.widget.PlaybackSeekUi.Client mSeekClient;
        public androidx.leanback.widget.PlaybackSeekDataProvider mSeekDataProvider;
        public java.lang.Object mSelectedItem;
        public androidx.leanback.widget.Presenter.ViewHolder mSelectedViewHolder;
        public final java.lang.StringBuilder mTempBuilder;
        public int mThumbHeroIndex;
        public androidx.leanback.widget.PlaybackSeekDataProvider.ResultCallback mThumbResult;
        public final androidx.leanback.widget.ThumbsBar mThumbsBar;
        public final android.widget.TextView mTotalTime;
        public long mTotalTimeInMs;
        public final /* synthetic */ androidx.leanback.widget.PlaybackTransportRowPresenter this$0;






        public ViewHolder(androidx.leanback.widget.PlaybackTransportRowPresenter r3, android.view.View r4, androidx.leanback.widget.Presenter r5) {
                r2 = this;
                r2.this$0 = r3
                r2.<init>(r4)
                r0 = -9223372036854775808
                r2.mTotalTimeInMs = r0
                r2.mCurrentTimeInMs = r0
                java.lang.StringBuilder r3 = new java.lang.StringBuilder
                r3.<init>()
                r2.mTempBuilder = r3
                androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r3 = new androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData
                r3.<init>()
                r2.mControlsBoundData = r3
                androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r3 = new androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData
                r3.<init>()
                r2.mSecondaryBoundData = r3
                r3 = -1
                r2.mThumbHeroIndex = r3
                androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$1 r3 = new androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$1
                r3.<init>(r2)
                r2.mListener = r3
                androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$2 r3 = new androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$2
                r3.<init>(r2)
                r2.mThumbResult = r3
                int r3 = androidx.leanback.R.id.image
                android.view.View r3 = r4.findViewById(r3)
                android.widget.ImageView r3 = (android.widget.ImageView) r3
                r2.mImageView = r3
                int r3 = androidx.leanback.R.id.description_dock
                android.view.View r3 = r4.findViewById(r3)
                android.view.ViewGroup r3 = (android.view.ViewGroup) r3
                r2.mDescriptionDock = r3
                int r0 = androidx.leanback.R.id.current_time
                android.view.View r0 = r4.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2.mCurrentTime = r0
                int r0 = androidx.leanback.R.id.total_time
                android.view.View r0 = r4.findViewById(r0)
                android.widget.TextView r0 = (android.widget.TextView) r0
                r2.mTotalTime = r0
                int r0 = androidx.leanback.R.id.playback_progress
                android.view.View r0 = r4.findViewById(r0)
                androidx.leanback.widget.SeekBar r0 = (androidx.leanback.widget.SeekBar) r0
                r2.mProgressBar = r0
                androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$3 r1 = new androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$3
                r1.<init>(r2)
                r0.setOnClickListener(r1)
                androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$4 r1 = new androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$4
                r1.<init>(r2)
                r0.setOnKeyListener(r1)
                androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$5 r1 = new androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder$5
                r1.<init>(r2)
                r0.setAccessibilitySeekListener(r1)
                r1 = 2147483647(0x7fffffff, float:NaN)
                r0.setMax(r1)
                int r0 = androidx.leanback.R.id.controls_dock
                android.view.View r0 = r4.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r2.mControlsDock = r0
                int r0 = androidx.leanback.R.id.secondary_controls_dock
                android.view.View r0 = r4.findViewById(r0)
                android.view.ViewGroup r0 = (android.view.ViewGroup) r0
                r2.mSecondaryControlsDock = r0
                if (r5 != 0) goto L99
                r5 = 0
                goto L9d
            L99:
                androidx.leanback.widget.Presenter$ViewHolder r5 = r5.onCreateViewHolder(r3)
            L9d:
                r2.mDescriptionViewHolder = r5
                if (r5 == 0) goto La6
                android.view.View r5 = r5.view
                r3.addView(r5)
            La6:
                int r3 = androidx.leanback.R.id.thumbs_row
                android.view.View r3 = r4.findViewById(r3)
                androidx.leanback.widget.ThumbsBar r3 = (androidx.leanback.widget.ThumbsBar) r3
                r2.mThumbsBar = r3
                return
        }

        public final void dispatchItemSelection() {
                r4 = this;
                boolean r0 = r4.isSelected()
                if (r0 != 0) goto L7
                return
            L7:
                androidx.leanback.widget.Presenter$ViewHolder r0 = r4.mSelectedViewHolder
                if (r0 != 0) goto L1e
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                if (r0 == 0) goto L33
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                androidx.leanback.widget.Row r1 = r4.getRow()
                r2 = 0
                r0.onItemSelected(r2, r2, r4, r1)
                goto L33
            L1e:
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                if (r0 == 0) goto L33
                androidx.leanback.widget.BaseOnItemViewSelectedListener r0 = r4.getOnItemViewSelectedListener()
                androidx.leanback.widget.Presenter$ViewHolder r1 = r4.mSelectedViewHolder
                java.lang.Object r2 = r4.mSelectedItem
                androidx.leanback.widget.Row r3 = r4.getRow()
                r0.onItemSelected(r1, r2, r4, r3)
            L33:
                return
        }

        public final android.widget.TextView getCurrentPositionView() {
                r1 = this;
                android.widget.TextView r0 = r1.mCurrentTime
                return r0
        }

        public final androidx.leanback.widget.Presenter.ViewHolder getDescriptionViewHolder() {
                r1 = this;
                androidx.leanback.widget.Presenter$ViewHolder r0 = r1.mDescriptionViewHolder
                return r0
        }

        public final android.widget.TextView getDurationView() {
                r1 = this;
                android.widget.TextView r0 = r1.mTotalTime
                return r0
        }

        public final androidx.leanback.widget.Presenter getPresenter(boolean r3) {
                r2 = this;
                if (r3 == 0) goto Ld
                androidx.leanback.widget.Row r3 = r2.getRow()
                androidx.leanback.widget.PlaybackControlsRow r3 = (androidx.leanback.widget.PlaybackControlsRow) r3
                androidx.leanback.widget.ObjectAdapter r3 = r3.getPrimaryActionsAdapter()
                goto L17
            Ld:
                androidx.leanback.widget.Row r3 = r2.getRow()
                androidx.leanback.widget.PlaybackControlsRow r3 = (androidx.leanback.widget.PlaybackControlsRow) r3
                androidx.leanback.widget.ObjectAdapter r3 = r3.getSecondaryActionsAdapter()
            L17:
                r0 = 0
                if (r3 != 0) goto L1b
                return r0
            L1b:
                androidx.leanback.widget.PresenterSelector r1 = r3.getPresenterSelector()
                boolean r1 = r1 instanceof androidx.leanback.widget.ControlButtonPresenterSelector
                if (r1 == 0) goto L2e
                androidx.leanback.widget.PresenterSelector r3 = r3.getPresenterSelector()
                androidx.leanback.widget.ControlButtonPresenterSelector r3 = (androidx.leanback.widget.ControlButtonPresenterSelector) r3
                androidx.leanback.widget.Presenter r3 = r3.getSecondaryPresenter()
                return r3
            L2e:
                int r1 = r3.size()
                if (r1 <= 0) goto L39
                r0 = 0
                java.lang.Object r0 = r3.get(r0)
            L39:
                androidx.leanback.widget.Presenter r3 = r3.getPresenter(r0)
                return r3
        }

        public final void setCurrentPosition(long r5) {
                r4 = this;
                long r0 = r4.mCurrentTimeInMs
                int r2 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
                if (r2 == 0) goto L1c
                r4.mCurrentTimeInMs = r5
                android.widget.TextView r0 = r4.mCurrentTime
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = r4.mTempBuilder
                androidx.leanback.widget.PlaybackTransportRowPresenter.formatTime(r5, r0)
                android.widget.TextView r5 = r4.mCurrentTime
                java.lang.StringBuilder r6 = r4.mTempBuilder
                java.lang.String r6 = r6.toString()
                r5.setText(r6)
            L1c:
                boolean r5 = r4.mInSeek
                if (r5 != 0) goto L3b
                r5 = 0
                long r0 = r4.mTotalTimeInMs
                r2 = 0
                int r6 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
                if (r6 <= 0) goto L36
                long r5 = r4.mCurrentTimeInMs
                double r5 = (double) r5
                double r0 = (double) r0
                double r5 = r5 / r0
                r0 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
                double r5 = r5 * r0
                int r5 = (int) r5
            L36:
                androidx.leanback.widget.SeekBar r6 = r4.mProgressBar
                r6.setProgress(r5)
            L3b:
                return
        }

        @Override // androidx.leanback.widget.PlaybackSeekUi
        public void setPlaybackSeekUiClient(androidx.leanback.widget.PlaybackSeekUi.Client r1) {
                r0 = this;
                r0.mSeekClient = r1
                return
        }

        public final void setTotalTime(long r4) {
                r3 = this;
                long r0 = r3.mTotalTimeInMs
                int r2 = (r0 > r4 ? 1 : (r0 == r4 ? 0 : -1))
                if (r2 == 0) goto L1c
                r3.mTotalTimeInMs = r4
                android.widget.TextView r0 = r3.mTotalTime
                if (r0 == 0) goto L1c
                java.lang.StringBuilder r0 = r3.mTempBuilder
                androidx.leanback.widget.PlaybackTransportRowPresenter.formatTime(r4, r0)
                android.widget.TextView r4 = r3.mTotalTime
                java.lang.StringBuilder r5 = r3.mTempBuilder
                java.lang.String r5 = r5.toString()
                r4.setText(r5)
            L1c:
                return
        }

        public final boolean startSeek() {
                r7 = this;
                boolean r0 = r7.mInSeek
                r1 = 1
                if (r0 == 0) goto L6
                return r1
            L6:
                androidx.leanback.widget.PlaybackSeekUi$Client r0 = r7.mSeekClient
                r2 = 0
                if (r0 == 0) goto L66
                boolean r0 = r0.isSeekEnabled()
                if (r0 == 0) goto L66
                long r3 = r7.mTotalTimeInMs
                r5 = 0
                int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                if (r0 > 0) goto L1a
                goto L66
            L1a:
                r7.mInSeek = r1
                androidx.leanback.widget.PlaybackSeekUi$Client r0 = r7.mSeekClient
                r0.onSeekStarted()
                androidx.leanback.widget.PlaybackSeekUi$Client r0 = r7.mSeekClient
                androidx.leanback.widget.PlaybackSeekDataProvider r0 = r0.getPlaybackSeekDataProvider()
                r7.mSeekDataProvider = r0
                if (r0 == 0) goto L30
                long[] r0 = r0.getSeekPositions()
                goto L31
            L30:
                r0 = 0
            L31:
                r7.mPositions = r0
                if (r0 == 0) goto L46
                long r3 = r7.mTotalTimeInMs
                int r0 = java.util.Arrays.binarySearch(r0, r3)
                if (r0 < 0) goto L41
                int r0 = r0 + r1
                r7.mPositionsLength = r0
                goto L48
            L41:
                int r0 = (-1) - r0
                r7.mPositionsLength = r0
                goto L48
            L46:
                r7.mPositionsLength = r2
            L48:
                androidx.leanback.widget.ControlBarPresenter$ViewHolder r0 = r7.mControlsVh
                android.view.View r0 = r0.view
                r3 = 8
                r0.setVisibility(r3)
                androidx.leanback.widget.ControlBarPresenter$ViewHolder r0 = r7.mSecondaryControlsVh
                android.view.View r0 = r0.view
                r3 = 4
                r0.setVisibility(r3)
                androidx.leanback.widget.Presenter$ViewHolder r0 = r7.mDescriptionViewHolder
                android.view.View r0 = r0.view
                r0.setVisibility(r3)
                androidx.leanback.widget.ThumbsBar r0 = r7.mThumbsBar
                r0.setVisibility(r2)
                return r1
            L66:
                return r2
        }

        public final void stopSeek(boolean r3) {
                r2 = this;
                boolean r0 = r2.mInSeek
                if (r0 != 0) goto L5
                return
            L5:
                r0 = 0
                r2.mInSeek = r0
                androidx.leanback.widget.PlaybackSeekUi$Client r1 = r2.mSeekClient
                r1.onSeekFinished(r3)
                androidx.leanback.widget.PlaybackSeekDataProvider r3 = r2.mSeekDataProvider
                if (r3 == 0) goto L14
                r3.reset()
            L14:
                r3 = -1
                r2.mThumbHeroIndex = r3
                androidx.leanback.widget.ThumbsBar r3 = r2.mThumbsBar
                r3.clearThumbBitmaps()
                r3 = 0
                r2.mSeekDataProvider = r3
                r2.mPositions = r3
                r2.mPositionsLength = r0
                androidx.leanback.widget.ControlBarPresenter$ViewHolder r3 = r2.mControlsVh
                android.view.View r3 = r3.view
                r3.setVisibility(r0)
                androidx.leanback.widget.ControlBarPresenter$ViewHolder r3 = r2.mSecondaryControlsVh
                android.view.View r3 = r3.view
                r3.setVisibility(r0)
                androidx.leanback.widget.Presenter$ViewHolder r3 = r2.mDescriptionViewHolder
                android.view.View r3 = r3.view
                r3.setVisibility(r0)
                androidx.leanback.widget.ThumbsBar r3 = r2.mThumbsBar
                r0 = 4
                r3.setVisibility(r0)
                return
        }

        public final void updateProgressInSeek(boolean r15) {
                r14 = this;
                long r0 = r14.mCurrentTimeInMs
                int r2 = r14.mPositionsLength
                r3 = 0
                if (r2 <= 0) goto L10d
                long[] r5 = r14.mPositions
                r6 = 0
                int r0 = java.util.Arrays.binarySearch(r5, r6, r2, r0)
                r1 = 1
                if (r15 == 0) goto L39
                if (r0 < 0) goto L23
                int r2 = r14.mPositionsLength
                int r2 = r2 - r1
                if (r0 >= r2) goto L20
                long[] r2 = r14.mPositions
                int r0 = r0 + 1
                r3 = r2[r0]
                goto L4f
            L20:
                long r3 = r14.mTotalTimeInMs
                goto L4f
            L23:
                int r0 = (-1) - r0
                int r2 = r14.mPositionsLength
                int r2 = r2 - r1
                if (r0 > r2) goto L2f
                long[] r2 = r14.mPositions
                r3 = r2[r0]
                goto L4f
            L2f:
                long r2 = r14.mTotalTimeInMs
                if (r0 <= 0) goto L36
                int r0 = r0 + (-1)
                goto L37
            L36:
                r0 = 0
            L37:
                r3 = r2
                goto L4f
            L39:
                if (r0 < 0) goto L44
                if (r0 <= 0) goto L4e
                long[] r2 = r14.mPositions
                int r0 = r0 + (-1)
                r3 = r2[r0]
                goto L4f
            L44:
                int r0 = (-1) - r0
                if (r0 <= 0) goto L4e
                long[] r2 = r14.mPositions
                int r0 = r0 - r1
                r3 = r2[r0]
                goto L4f
            L4e:
                r0 = 0
            L4f:
                int r2 = r14.mThumbHeroIndex
                if (r2 != r0) goto L55
                goto L12c
            L55:
                androidx.leanback.widget.ThumbsBar r2 = r14.mThumbsBar
                int r2 = r2.getChildCount()
                if (r2 < 0) goto L107
                r5 = r2 & 1
                if (r5 == 0) goto L107
                int r5 = r2 / 2
                int r7 = r0 - r5
                int r7 = java.lang.Math.max(r7, r6)
                int r8 = r0 + r5
                int r9 = r14.mPositionsLength
                int r9 = r9 - r1
                int r8 = java.lang.Math.min(r8, r9)
                int r9 = r14.mThumbHeroIndex
                if (r9 >= 0) goto L78
                r9 = r7
                goto Lac
            L78:
                if (r0 <= r9) goto L7c
                r15 = 1
                goto L7d
            L7c:
                r15 = 0
            L7d:
                int r9 = r9 - r5
                int r9 = java.lang.Math.max(r9, r6)
                int r10 = r14.mThumbHeroIndex
                int r10 = r10 + r5
                int r11 = r14.mPositionsLength
                int r11 = r11 - r1
                int r10 = java.lang.Math.min(r10, r11)
                if (r15 == 0) goto Laf
                int r10 = r10 + r1
                int r9 = java.lang.Math.max(r10, r7)
                r10 = r7
            L94:
                int r11 = r9 + (-1)
                if (r10 > r11) goto Lac
                androidx.leanback.widget.ThumbsBar r11 = r14.mThumbsBar
                int r12 = r10 - r0
                int r12 = r12 + r5
                int r13 = r14.mThumbHeroIndex
                int r13 = r10 - r13
                int r13 = r13 + r5
                android.graphics.Bitmap r13 = r11.getThumbBitmap(r13)
                r11.setThumbBitmap(r12, r13)
                int r10 = r10 + 1
                goto L94
            Lac:
                r10 = r9
                r9 = r8
                goto Lce
            Laf:
                int r9 = r9 - r1
                int r9 = java.lang.Math.min(r9, r8)
                r10 = r8
            Lb5:
                int r11 = r9 + 1
                if (r10 < r11) goto Lcd
                androidx.leanback.widget.ThumbsBar r11 = r14.mThumbsBar
                int r12 = r10 - r0
                int r12 = r12 + r5
                int r13 = r14.mThumbHeroIndex
                int r13 = r10 - r13
                int r13 = r13 + r5
                android.graphics.Bitmap r13 = r11.getThumbBitmap(r13)
                r11.setThumbBitmap(r12, r13)
                int r10 = r10 + (-1)
                goto Lb5
            Lcd:
                r10 = r7
            Lce:
                r14.mThumbHeroIndex = r0
                if (r15 == 0) goto Lde
            Ld2:
                if (r10 > r9) goto Lea
                androidx.leanback.widget.PlaybackSeekDataProvider r15 = r14.mSeekDataProvider
                androidx.leanback.widget.PlaybackSeekDataProvider$ResultCallback r0 = r14.mThumbResult
                r15.getThumbnail(r10, r0)
                int r10 = r10 + 1
                goto Ld2
            Lde:
                if (r9 < r10) goto Lea
                androidx.leanback.widget.PlaybackSeekDataProvider r15 = r14.mSeekDataProvider
                androidx.leanback.widget.PlaybackSeekDataProvider$ResultCallback r0 = r14.mThumbResult
                r15.getThumbnail(r9, r0)
                int r9 = r9 + (-1)
                goto Lde
            Lea:
                int r15 = r14.mThumbHeroIndex
                int r0 = r5 - r15
                int r0 = r0 + r7
                r9 = 0
                if (r6 >= r0) goto Lfa
                androidx.leanback.widget.ThumbsBar r15 = r14.mThumbsBar
                r15.setThumbBitmap(r6, r9)
                int r6 = r6 + 1
                goto Lea
            Lfa:
                int r5 = r5 + r8
                int r5 = r5 - r15
                int r5 = r5 + r1
            Lfd:
                if (r5 >= r2) goto L12c
                androidx.leanback.widget.ThumbsBar r15 = r14.mThumbsBar
                r15.setThumbBitmap(r5, r9)
                int r5 = r5 + 1
                goto Lfd
            L107:
                java.lang.RuntimeException r15 = new java.lang.RuntimeException
                r15.<init>()
                throw r15
            L10d:
                long r5 = r14.mTotalTimeInMs
                float r2 = (float) r5
                androidx.leanback.widget.PlaybackTransportRowPresenter r5 = r14.this$0
                float r5 = r5.getDefaultSeekIncrement()
                float r5 = r5 * r2
                long r5 = (long) r5
                if (r15 == 0) goto L11c
                goto L11d
            L11c:
                long r5 = -r5
            L11d:
                long r0 = r0 + r5
                long r5 = r14.mTotalTimeInMs
                int r15 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
                if (r15 <= 0) goto L126
                r3 = r5
                goto L12c
            L126:
                int r15 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
                if (r15 >= 0) goto L12b
                goto L12c
            L12b:
                r3 = r0
            L12c:
                double r0 = (double) r3
                long r5 = r14.mTotalTimeInMs
                double r5 = (double) r5
                double r0 = r0 / r5
                androidx.leanback.widget.SeekBar r15 = r14.mProgressBar
                r5 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
                double r0 = r0 * r5
                int r0 = (int) r0
                r15.setProgress(r0)
                androidx.leanback.widget.PlaybackSeekUi$Client r15 = r14.mSeekClient
                r15.onSeekPositionChanged(r3)
                return
        }
    }

    public PlaybackTransportRowPresenter() {
            r5 = this;
            r5.<init>()
            r0 = 1008981770(0x3c23d70a, float:0.01)
            r5.mDefaultSeekIncrement = r0
            r0 = 0
            r5.mProgressColor = r0
            r5.mSecondaryProgressColor = r0
            androidx.leanback.widget.PlaybackTransportRowPresenter$1 r1 = new androidx.leanback.widget.PlaybackTransportRowPresenter$1
            r1.<init>()
            r5.mOnControlSelectedListener = r1
            androidx.leanback.widget.PlaybackTransportRowPresenter$2 r2 = new androidx.leanback.widget.PlaybackTransportRowPresenter$2
            r2.<init>(r5)
            r5.mOnControlClickedListener = r2
            r3 = 0
            r5.setHeaderPresenter(r3)
            r5.setSelectEffectEnabled(r0)
            androidx.leanback.widget.ControlBarPresenter r3 = new androidx.leanback.widget.ControlBarPresenter
            int r4 = androidx.leanback.R.layout.lb_control_bar
            r3.<init>(r4)
            r5.mPlaybackControlsPresenter = r3
            r3.mDefaultFocusToMiddle = r0
            androidx.leanback.widget.ControlBarPresenter r3 = new androidx.leanback.widget.ControlBarPresenter
            r3.<init>(r4)
            r5.mSecondaryControlsPresenter = r3
            r3.mDefaultFocusToMiddle = r0
            androidx.leanback.widget.ControlBarPresenter r0 = r5.mPlaybackControlsPresenter
            r0.setOnControlSelectedListener(r1)
            androidx.leanback.widget.ControlBarPresenter r0 = r5.mSecondaryControlsPresenter
            r0.setOnControlSelectedListener(r1)
            androidx.leanback.widget.ControlBarPresenter r0 = r5.mPlaybackControlsPresenter
            r0.setOnControlClickedListener(r2)
            androidx.leanback.widget.ControlBarPresenter r0 = r5.mSecondaryControlsPresenter
            r0.setOnControlClickedListener(r2)
            return
    }

    public static void formatTime(long r11, java.lang.StringBuilder r13) {
            r0 = 0
            r13.setLength(r0)
            r0 = 0
            int r2 = (r11 > r0 ? 1 : (r11 == r0 ? 0 : -1))
            if (r2 >= 0) goto L10
            java.lang.String r11 = "--"
            r13.append(r11)
            return
        L10:
            r2 = 1000(0x3e8, double:4.94E-321)
            long r11 = r11 / r2
            r2 = 60
            long r4 = r11 / r2
            long r6 = r4 / r2
            long r8 = r4 * r2
            long r11 = r11 - r8
            long r2 = r2 * r6
            long r4 = r4 - r2
            r2 = 48
            r8 = 10
            r3 = 58
            int r10 = (r6 > r0 ? 1 : (r6 == r0 ? 0 : -1))
            if (r10 <= 0) goto L36
            r13.append(r6)
            r13.append(r3)
            int r0 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
            if (r0 >= 0) goto L36
            r13.append(r2)
        L36:
            r13.append(r4)
            r13.append(r3)
            int r0 = (r11 > r8 ? 1 : (r11 == r8 ? 0 : -1))
            if (r0 >= 0) goto L43
            r13.append(r2)
        L43:
            r13.append(r11)
            return
    }

    private static int getDefaultProgressColor(android.content.Context r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.leanback.R.attr.playbackProgressPrimaryColor
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L1d
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r0.resourceId
            int r4 = r4.getColor(r0)
            return r4
        L1d:
            android.content.res.Resources r4 = r4.getResources()
            int r0 = androidx.leanback.R.color.lb_playback_progress_color_no_theme
            int r4 = r4.getColor(r0)
            return r4
    }

    private static int getDefaultSecondaryProgressColor(android.content.Context r4) {
            android.util.TypedValue r0 = new android.util.TypedValue
            r0.<init>()
            android.content.res.Resources$Theme r1 = r4.getTheme()
            int r2 = androidx.leanback.R.attr.playbackProgressSecondaryColor
            r3 = 1
            boolean r1 = r1.resolveAttribute(r2, r0, r3)
            if (r1 == 0) goto L1d
            android.content.res.Resources r4 = r4.getResources()
            int r0 = r0.resourceId
            int r4 = r4.getColor(r0)
            return r4
        L1d:
            android.content.res.Resources r4 = r4.getResources()
            int r0 = androidx.leanback.R.color.lb_playback_progress_secondary_color_no_theme
            int r4 = r4.getColor(r0)
            return r4
    }

    private void initRow(androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder r3) {
            r2 = this;
            androidx.leanback.widget.ControlBarPresenter r0 = r2.mPlaybackControlsPresenter
            android.view.ViewGroup r1 = r3.mControlsDock
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.onCreateViewHolder(r1)
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r0 = (androidx.leanback.widget.ControlBarPresenter.ViewHolder) r0
            r3.mControlsVh = r0
            androidx.leanback.widget.SeekBar r0 = r3.mProgressBar
            boolean r1 = r2.mProgressColorSet
            if (r1 == 0) goto L15
            int r1 = r2.mProgressColor
            goto L1f
        L15:
            android.view.ViewGroup r1 = r3.mControlsDock
            android.content.Context r1 = r1.getContext()
            int r1 = getDefaultProgressColor(r1)
        L1f:
            r0.setProgressColor(r1)
            androidx.leanback.widget.SeekBar r0 = r3.mProgressBar
            boolean r1 = r2.mSecondaryProgressColorSet
            if (r1 == 0) goto L2b
            int r1 = r2.mSecondaryProgressColor
            goto L35
        L2b:
            android.view.ViewGroup r1 = r3.mControlsDock
            android.content.Context r1 = r1.getContext()
            int r1 = getDefaultSecondaryProgressColor(r1)
        L35:
            r0.setSecondaryProgressColor(r1)
            android.view.ViewGroup r0 = r3.mControlsDock
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r1 = r3.mControlsVh
            android.view.View r1 = r1.view
            r0.addView(r1)
            androidx.leanback.widget.ControlBarPresenter r0 = r2.mSecondaryControlsPresenter
            android.view.ViewGroup r1 = r3.mSecondaryControlsDock
            androidx.leanback.widget.Presenter$ViewHolder r0 = r0.onCreateViewHolder(r1)
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r0 = (androidx.leanback.widget.ControlBarPresenter.ViewHolder) r0
            r3.mSecondaryControlsVh = r0
            android.view.ViewGroup r1 = r3.mSecondaryControlsDock
            android.view.View r0 = r0.view
            r1.addView(r0)
            android.view.View r0 = r3.view
            int r1 = androidx.leanback.R.id.transport_row
            android.view.View r0 = r0.findViewById(r1)
            androidx.leanback.widget.PlaybackTransportRowView r0 = (androidx.leanback.widget.PlaybackTransportRowView) r0
            androidx.leanback.widget.PlaybackTransportRowPresenter$3 r1 = new androidx.leanback.widget.PlaybackTransportRowPresenter$3
            r1.<init>(r3)
            r0.setOnUnhandledKeyListener(r1)
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final androidx.leanback.widget.RowPresenter.ViewHolder createRowViewHolder(android.view.ViewGroup r4) {
            r3 = this;
            android.content.Context r0 = r4.getContext()
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            int r1 = androidx.leanback.R.layout.lb_playback_transport_controls_row
            r2 = 0
            android.view.View r4 = r0.inflate(r1, r4, r2)
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r0 = new androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder
            androidx.leanback.widget.Presenter r1 = r3.mDescriptionPresenter
            r0.<init>(r3, r4, r1)
            r3.initRow(r0)
            return r0
    }

    public float getDefaultSeekIncrement() {
            r1 = this;
            float r0 = r1.mDefaultSeekIncrement
            return r0
    }

    public androidx.leanback.widget.OnActionClickedListener getOnActionClickedListener() {
            r1 = this;
            androidx.leanback.widget.OnActionClickedListener r0 = r1.mOnActionClickedListener
            return r0
    }

    @androidx.annotation.ColorInt
    public int getProgressColor() {
            r1 = this;
            int r0 = r1.mProgressColor
            return r0
    }

    @androidx.annotation.ColorInt
    public int getSecondaryProgressColor() {
            r1 = this;
            int r0 = r1.mSecondaryProgressColor
            return r0
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onBindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r6, java.lang.Object r7) {
            r5 = this;
            super.onBindRowViewHolder(r6, r7)
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r6 = (androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder) r6
            androidx.leanback.widget.Row r7 = r6.getRow()
            androidx.leanback.widget.PlaybackControlsRow r7 = (androidx.leanback.widget.PlaybackControlsRow) r7
            java.lang.Object r0 = r7.getItem()
            r1 = 8
            r2 = 0
            if (r0 != 0) goto L1a
            android.view.ViewGroup r0 = r6.mDescriptionDock
            r0.setVisibility(r1)
            goto L2c
        L1a:
            android.view.ViewGroup r0 = r6.mDescriptionDock
            r0.setVisibility(r2)
            androidx.leanback.widget.Presenter$ViewHolder r0 = r6.mDescriptionViewHolder
            if (r0 == 0) goto L2c
            androidx.leanback.widget.Presenter r3 = r5.mDescriptionPresenter
            java.lang.Object r4 = r7.getItem()
            r3.onBindViewHolder(r0, r4)
        L2c:
            android.graphics.drawable.Drawable r0 = r7.getImageDrawable()
            if (r0 != 0) goto L38
            android.widget.ImageView r0 = r6.mImageView
            r0.setVisibility(r1)
            goto L3d
        L38:
            android.widget.ImageView r0 = r6.mImageView
            r0.setVisibility(r2)
        L3d:
            android.widget.ImageView r0 = r6.mImageView
            android.graphics.drawable.Drawable r1 = r7.getImageDrawable()
            r0.setImageDrawable(r1)
            androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r0 = r6.mControlsBoundData
            androidx.leanback.widget.ObjectAdapter r1 = r7.getPrimaryActionsAdapter()
            r0.adapter = r1
            androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r0 = r6.mControlsBoundData
            r1 = 1
            androidx.leanback.widget.Presenter r1 = r6.getPresenter(r1)
            r0.presenter = r1
            androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r0 = r6.mControlsBoundData
            r0.mRowViewHolder = r6
            androidx.leanback.widget.ControlBarPresenter r1 = r5.mPlaybackControlsPresenter
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r3 = r6.mControlsVh
            r1.onBindViewHolder(r3, r0)
            androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r0 = r6.mSecondaryBoundData
            androidx.leanback.widget.ObjectAdapter r1 = r7.getSecondaryActionsAdapter()
            r0.adapter = r1
            androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r0 = r6.mSecondaryBoundData
            androidx.leanback.widget.Presenter r1 = r6.getPresenter(r2)
            r0.presenter = r1
            androidx.leanback.widget.PlaybackTransportRowPresenter$BoundData r0 = r6.mSecondaryBoundData
            r0.mRowViewHolder = r6
            androidx.leanback.widget.ControlBarPresenter r1 = r5.mSecondaryControlsPresenter
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r2 = r6.mSecondaryControlsVh
            r1.onBindViewHolder(r2, r0)
            long r0 = r7.getDuration()
            r6.setTotalTime(r0)
            long r0 = r7.getCurrentPosition()
            r6.setCurrentPosition(r0)
            long r0 = r7.getBufferedPosition()
            double r0 = (double) r0
            long r2 = r6.mTotalTimeInMs
            double r2 = (double) r2
            double r0 = r0 / r2
            r2 = 4746794007244308480(0x41dfffffffc00000, double:2.147483647E9)
            double r0 = r0 * r2
            androidx.leanback.widget.SeekBar r2 = r6.mProgressBar
            int r0 = (int) r0
            r2.setSecondaryProgress(r0)
            androidx.leanback.widget.PlaybackControlsRow$OnPlaybackProgressCallback r6 = r6.mListener
            r7.setOnPlaybackProgressChangedListener(r6)
            return
    }

    @Override // androidx.leanback.widget.PlaybackRowPresenter
    public void onReappear(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r2 = (androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder) r2
            android.view.View r0 = r2.view
            boolean r0 = r0.hasFocus()
            if (r0 == 0) goto Lf
            androidx.leanback.widget.SeekBar r2 = r2.mProgressBar
            r2.requestFocus()
        Lf:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewAttachedToWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onRowViewAttachedToWindow(r2)
            androidx.leanback.widget.Presenter r0 = r1.mDescriptionPresenter
            if (r0 == 0) goto Le
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r2 = (androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder) r2
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mDescriptionViewHolder
            r0.onViewAttachedToWindow(r2)
        Le:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewDetachedFromWindow(androidx.leanback.widget.RowPresenter.ViewHolder r2) {
            r1 = this;
            super.onRowViewDetachedFromWindow(r2)
            androidx.leanback.widget.Presenter r0 = r1.mDescriptionPresenter
            if (r0 == 0) goto Le
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r2 = (androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder) r2
            androidx.leanback.widget.Presenter$ViewHolder r2 = r2.mDescriptionViewHolder
            r0.onViewDetachedFromWindow(r2)
        Le:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public final void onRowViewSelected(androidx.leanback.widget.RowPresenter.ViewHolder r1, boolean r2) {
            r0 = this;
            super.onRowViewSelected(r1, r2)
            if (r2 == 0) goto La
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r1 = (androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder) r1
            r1.dispatchItemSelection()
        La:
            return
    }

    @Override // androidx.leanback.widget.RowPresenter
    public void onUnbindRowViewHolder(androidx.leanback.widget.RowPresenter.ViewHolder r5) {
            r4 = this;
            r0 = r5
            androidx.leanback.widget.PlaybackTransportRowPresenter$ViewHolder r0 = (androidx.leanback.widget.PlaybackTransportRowPresenter.ViewHolder) r0
            androidx.leanback.widget.Row r1 = r0.getRow()
            androidx.leanback.widget.PlaybackControlsRow r1 = (androidx.leanback.widget.PlaybackControlsRow) r1
            androidx.leanback.widget.Presenter$ViewHolder r2 = r0.mDescriptionViewHolder
            if (r2 == 0) goto L12
            androidx.leanback.widget.Presenter r3 = r4.mDescriptionPresenter
            r3.onUnbindViewHolder(r2)
        L12:
            androidx.leanback.widget.ControlBarPresenter r2 = r4.mPlaybackControlsPresenter
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r3 = r0.mControlsVh
            r2.onUnbindViewHolder(r3)
            androidx.leanback.widget.ControlBarPresenter r2 = r4.mSecondaryControlsPresenter
            androidx.leanback.widget.ControlBarPresenter$ViewHolder r0 = r0.mSecondaryControlsVh
            r2.onUnbindViewHolder(r0)
            r0 = 0
            r1.setOnPlaybackProgressChangedListener(r0)
            super.onUnbindRowViewHolder(r5)
            return
    }

    public void setDefaultSeekIncrement(float r1) {
            r0 = this;
            r0.mDefaultSeekIncrement = r1
            return
    }

    public void setDescriptionPresenter(androidx.leanback.widget.Presenter r1) {
            r0 = this;
            r0.mDescriptionPresenter = r1
            return
    }

    public void setOnActionClickedListener(androidx.leanback.widget.OnActionClickedListener r1) {
            r0 = this;
            r0.mOnActionClickedListener = r1
            return
    }

    public void setProgressColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mProgressColor = r1
            r1 = 1
            r0.mProgressColorSet = r1
            return
    }

    public void setSecondaryProgressColor(@androidx.annotation.ColorInt int r1) {
            r0 = this;
            r0.mSecondaryProgressColor = r1
            r1 = 1
            r0.mSecondaryProgressColorSet = r1
            return
    }
}
