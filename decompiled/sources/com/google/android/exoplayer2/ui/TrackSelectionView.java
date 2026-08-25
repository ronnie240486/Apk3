package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes2.dex */
public class TrackSelectionView extends android.widget.LinearLayout {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final com.google.android.exoplayer2.ui.TrackSelectionView.ComponentListener componentListener;
    private final android.widget.CheckedTextView defaultView;
    private final android.widget.CheckedTextView disableView;
    private final android.view.LayoutInflater inflater;
    private boolean isDisabled;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.TrackSelectionView.TrackSelectionListener listener;
    private final java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
    private final int selectableItemBackgroundResourceId;
    private final java.util.List<com.google.android.exoplayer2.Tracks.Group> trackGroups;

    @androidx.annotation.Nullable
    private java.util.Comparator<com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo> trackInfoComparator;
    private com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider;
    private android.widget.CheckedTextView[][] trackViews;

    /* JADX INFO: renamed from: com.google.android.exoplayer2.ui.TrackSelectionView$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public static /* synthetic */ class AnonymousClass1 {
    }

    /* JADX INFO: loaded from: classes.dex */
    public class ComponentListener implements android.view.View.OnClickListener {
        public final /* synthetic */ com.google.android.exoplayer2.ui.TrackSelectionView this$0;

        private ComponentListener(com.google.android.exoplayer2.ui.TrackSelectionView r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        public /* synthetic */ ComponentListener(com.google.android.exoplayer2.ui.TrackSelectionView r1, com.google.android.exoplayer2.ui.TrackSelectionView.AnonymousClass1 r2) {
                r0 = this;
                r0.<init>(r1)
                return
        }

        @Override // android.view.View.OnClickListener
        public void onClick(android.view.View r2) {
                r1 = this;
                com.google.android.exoplayer2.ui.TrackSelectionView r0 = r1.this$0
                com.google.android.exoplayer2.ui.TrackSelectionView.access$100(r0, r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static final class TrackInfo {
        public final com.google.android.exoplayer2.Tracks.Group trackGroup;
        public final int trackIndex;

        public TrackInfo(com.google.android.exoplayer2.Tracks.Group r1, int r2) {
                r0 = this;
                r0.<init>()
                r0.trackGroup = r1
                r0.trackIndex = r2
                return
        }

        public com.google.android.exoplayer2.Format getFormat() {
                r2 = this;
                com.google.android.exoplayer2.Tracks$Group r0 = r2.trackGroup
                int r1 = r2.trackIndex
                com.google.android.exoplayer2.Format r0 = r0.getTrackFormat(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public interface TrackSelectionListener {
        void onTrackSelectionChanged(boolean r1, java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2);
    }

    public static /* synthetic */ int $r8$lambda$MlPGGVKgzZCXcTBDpZsZ_1iqJsk(java.util.Comparator r0, com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo r1, com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo r2) {
            int r0 = lambda$init$0(r0, r1, r2)
            return r0
    }

    public TrackSelectionView(android.content.Context r2) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r0)
            return
    }

    public TrackSelectionView(android.content.Context r2, @androidx.annotation.Nullable android.util.AttributeSet r3) {
            r1 = this;
            r0 = 0
            r1.<init>(r2, r3, r0)
            return
    }

    public TrackSelectionView(android.content.Context r6, @androidx.annotation.Nullable android.util.AttributeSet r7, @androidx.annotation.AttrRes int r8) {
            r5 = this;
            r5.<init>(r6, r7, r8)
            r7 = 1
            r5.setOrientation(r7)
            r8 = 0
            r5.setSaveFromParentEnabled(r8)
            android.content.res.Resources$Theme r0 = r6.getTheme()
            int[] r1 = new int[r7]
            r2 = 16843534(0x101030e, float:2.369575E-38)
            r1[r8] = r2
            android.content.res.TypedArray r0 = r0.obtainStyledAttributes(r1)
            int r1 = r0.getResourceId(r8, r8)
            r5.selectableItemBackgroundResourceId = r1
            r0.recycle()
            android.view.LayoutInflater r6 = android.view.LayoutInflater.from(r6)
            r5.inflater = r6
            com.google.android.exoplayer2.ui.TrackSelectionView$ComponentListener r0 = new com.google.android.exoplayer2.ui.TrackSelectionView$ComponentListener
            r2 = 0
            r0.<init>(r5, r2)
            r5.componentListener = r0
            com.google.android.exoplayer2.ui.DefaultTrackNameProvider r2 = new com.google.android.exoplayer2.ui.DefaultTrackNameProvider
            android.content.res.Resources r3 = r5.getResources()
            r2.<init>(r3)
            r5.trackNameProvider = r2
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r5.trackGroups = r2
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r5.overrides = r2
            r2 = 17367055(0x109000f, float:2.5162968E-38)
            android.view.View r3 = r6.inflate(r2, r5, r8)
            android.widget.CheckedTextView r3 = (android.widget.CheckedTextView) r3
            r5.disableView = r3
            r3.setBackgroundResource(r1)
            int r4 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_none
            r3.setText(r4)
            r3.setEnabled(r8)
            r3.setFocusable(r7)
            r3.setOnClickListener(r0)
            r4 = 8
            r3.setVisibility(r4)
            r5.addView(r3)
            int r3 = com.google.android.exoplayer2.ui.R.layout.exo_list_divider
            android.view.View r3 = r6.inflate(r3, r5, r8)
            r5.addView(r3)
            android.view.View r6 = r6.inflate(r2, r5, r8)
            android.widget.CheckedTextView r6 = (android.widget.CheckedTextView) r6
            r5.defaultView = r6
            r6.setBackgroundResource(r1)
            int r1 = com.google.android.exoplayer2.ui.R.string.exo_track_selection_auto
            r6.setText(r1)
            r6.setEnabled(r8)
            r6.setFocusable(r7)
            r6.setOnClickListener(r0)
            r5.addView(r6)
            return
    }

    public static /* synthetic */ void access$100(com.google.android.exoplayer2.ui.TrackSelectionView r0, android.view.View r1) {
            r0.onClick(r1)
            return
    }

    public static java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> filterOverrides(java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r4, java.util.List<com.google.android.exoplayer2.Tracks.Group> r5, boolean r6) {
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            r1 = 0
        L6:
            int r2 = r5.size()
            if (r1 >= r2) goto L2e
            java.lang.Object r2 = r5.get(r1)
            com.google.android.exoplayer2.Tracks$Group r2 = (com.google.android.exoplayer2.Tracks.Group) r2
            com.google.android.exoplayer2.source.TrackGroup r2 = r2.getMediaTrackGroup()
            java.lang.Object r2 = r4.get(r2)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r2 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r2
            if (r2 == 0) goto L2b
            if (r6 != 0) goto L26
            boolean r3 = r0.isEmpty()
            if (r3 == 0) goto L2b
        L26:
            com.google.android.exoplayer2.source.TrackGroup r3 = r2.mediaTrackGroup
            r0.put(r3, r2)
        L2b:
            int r1 = r1 + 1
            goto L6
        L2e:
            return r0
    }

    private static /* synthetic */ int lambda$init$0(java.util.Comparator r0, com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo r1, com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo r2) {
            com.google.android.exoplayer2.Format r1 = r1.getFormat()
            com.google.android.exoplayer2.Format r2 = r2.getFormat()
            int r0 = r0.compare(r1, r2)
            return r0
    }

    private void onClick(android.view.View r3) {
            r2 = this;
            android.widget.CheckedTextView r0 = r2.disableView
            if (r3 != r0) goto L8
            r2.onDisableViewClicked()
            goto L13
        L8:
            android.widget.CheckedTextView r0 = r2.defaultView
            if (r3 != r0) goto L10
            r2.onDefaultViewClicked()
            goto L13
        L10:
            r2.onTrackViewClicked(r3)
        L13:
            r2.updateViewStates()
            com.google.android.exoplayer2.ui.TrackSelectionView$TrackSelectionListener r3 = r2.listener
            if (r3 == 0) goto L25
            boolean r0 = r2.getIsDisabled()
            java.util.Map r1 = r2.getOverrides()
            r3.onTrackSelectionChanged(r0, r1)
        L25:
            return
    }

    private void onDefaultViewClicked() {
            r1 = this;
            r0 = 0
            r1.isDisabled = r0
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r1.overrides
            r0.clear()
            return
    }

    private void onDisableViewClicked() {
            r1 = this;
            r0 = 1
            r1.isDisabled = r0
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r1.overrides
            r0.clear()
            return
    }

    private void onTrackViewClicked(android.view.View r7) {
            r6 = this;
            r0 = 0
            r6.isDisabled = r0
            java.lang.Object r1 = r7.getTag()
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.ui.TrackSelectionView$TrackInfo r1 = (com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo) r1
            com.google.android.exoplayer2.Tracks$Group r2 = r1.trackGroup
            com.google.android.exoplayer2.source.TrackGroup r2 = r2.getMediaTrackGroup()
            int r3 = r1.trackIndex
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r4 = r6.overrides
            java.lang.Object r4 = r4.get(r2)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r4 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r4
            if (r4 != 0) goto L43
            boolean r7 = r6.allowMultipleOverrides
            if (r7 != 0) goto L30
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            int r7 = r7.size()
            if (r7 <= 0) goto L30
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            r7.clear()
        L30:
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.<init>(r2, r1)
            r7.put(r2, r0)
            goto La9
        L43:
            java.util.ArrayList r5 = new java.util.ArrayList
            com.google.common.collect.ImmutableList<java.lang.Integer> r4 = r4.trackIndices
            r5.<init>(r4)
            android.widget.CheckedTextView r7 = (android.widget.CheckedTextView) r7
            boolean r7 = r7.isChecked()
            com.google.android.exoplayer2.Tracks$Group r1 = r1.trackGroup
            boolean r1 = r6.shouldEnableAdaptiveSelection(r1)
            if (r1 != 0) goto L5e
            boolean r4 = r6.shouldEnableMultiGroupSelection()
            if (r4 == 0) goto L5f
        L5e:
            r0 = 1
        L5f:
            if (r7 == 0) goto L81
            if (r0 == 0) goto L81
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.remove(r7)
            boolean r7 = r5.isEmpty()
            if (r7 == 0) goto L76
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            r7.remove(r2)
            goto La9
        L76:
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride
            r0.<init>(r2, r5)
            r7.put(r2, r0)
            goto La9
        L81:
            if (r7 != 0) goto La9
            if (r1 == 0) goto L97
            java.lang.Integer r7 = java.lang.Integer.valueOf(r3)
            r5.add(r7)
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride
            r0.<init>(r2, r5)
            r7.put(r2, r0)
            goto La9
        L97:
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r7 = r6.overrides
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r0 = new com.google.android.exoplayer2.trackselection.TrackSelectionOverride
            java.lang.Integer r1 = java.lang.Integer.valueOf(r3)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.of(r1)
            r0.<init>(r2, r1)
            r7.put(r2, r0)
        La9:
            return
    }

    private boolean shouldEnableAdaptiveSelection(com.google.android.exoplayer2.Tracks.Group r2) {
            r1 = this;
            boolean r0 = r1.allowAdaptiveSelections
            if (r0 == 0) goto Lc
            boolean r2 = r2.isAdaptiveSupported()
            if (r2 == 0) goto Lc
            r2 = 1
            goto Ld
        Lc:
            r2 = 0
        Ld:
            return r2
    }

    private boolean shouldEnableMultiGroupSelection() {
            r2 = this;
            boolean r0 = r2.allowMultipleOverrides
            r1 = 1
            if (r0 == 0) goto Le
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r0 = r2.trackGroups
            int r0 = r0.size()
            if (r0 <= r1) goto Le
            goto Lf
        Le:
            r1 = 0
        Lf:
            return r1
    }

    private void updateViewStates() {
            r7 = this;
            android.widget.CheckedTextView r0 = r7.disableView
            boolean r1 = r7.isDisabled
            r0.setChecked(r1)
            android.widget.CheckedTextView r0 = r7.defaultView
            boolean r1 = r7.isDisabled
            r2 = 0
            if (r1 != 0) goto L18
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r1 = r7.overrides
            int r1 = r1.size()
            if (r1 != 0) goto L18
            r1 = 1
            goto L19
        L18:
            r1 = 0
        L19:
            r0.setChecked(r1)
            r0 = 0
        L1d:
            android.widget.CheckedTextView[][] r1 = r7.trackViews
            int r1 = r1.length
            if (r0 >= r1) goto L71
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r1 = r7.overrides
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r3 = r7.trackGroups
            java.lang.Object r3 = r3.get(r0)
            com.google.android.exoplayer2.Tracks$Group r3 = (com.google.android.exoplayer2.Tracks.Group) r3
            com.google.android.exoplayer2.source.TrackGroup r3 = r3.getMediaTrackGroup()
            java.lang.Object r1 = r1.get(r3)
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r1 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r1
            r3 = 0
        L37:
            android.widget.CheckedTextView[][] r4 = r7.trackViews
            r5 = r4[r0]
            int r5 = r5.length
            if (r3 >= r5) goto L6e
            if (r1 == 0) goto L64
            r4 = r4[r0]
            r4 = r4[r3]
            java.lang.Object r4 = r4.getTag()
            java.lang.Object r4 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r4)
            com.google.android.exoplayer2.ui.TrackSelectionView$TrackInfo r4 = (com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo) r4
            android.widget.CheckedTextView[][] r5 = r7.trackViews
            r5 = r5[r0]
            r5 = r5[r3]
            com.google.common.collect.ImmutableList<java.lang.Integer> r6 = r1.trackIndices
            int r4 = r4.trackIndex
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)
            boolean r4 = r6.contains(r4)
            r5.setChecked(r4)
            goto L6b
        L64:
            r4 = r4[r0]
            r4 = r4[r3]
            r4.setChecked(r2)
        L6b:
            int r3 = r3 + 1
            goto L37
        L6e:
            int r0 = r0 + 1
            goto L1d
        L71:
            return
    }

    private void updateViews() {
            r12 = this;
            int r0 = r12.getChildCount()
            r1 = 1
            int r0 = r0 - r1
        L6:
            r2 = 3
            if (r0 < r2) goto Lf
            r12.removeViewAt(r0)
            int r0 = r0 + (-1)
            goto L6
        Lf:
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r0 = r12.trackGroups
            boolean r0 = r0.isEmpty()
            r2 = 0
            if (r0 == 0) goto L23
            android.widget.CheckedTextView r0 = r12.disableView
            r0.setEnabled(r2)
            android.widget.CheckedTextView r0 = r12.defaultView
            r0.setEnabled(r2)
            return
        L23:
            android.widget.CheckedTextView r0 = r12.disableView
            r0.setEnabled(r1)
            android.widget.CheckedTextView r0 = r12.defaultView
            r0.setEnabled(r1)
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r0 = r12.trackGroups
            int r0 = r0.size()
            android.widget.CheckedTextView[][] r0 = new android.widget.CheckedTextView[r0][]
            r12.trackViews = r0
            boolean r0 = r12.shouldEnableMultiGroupSelection()
            r3 = 0
        L3c:
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r4 = r12.trackGroups
            int r4 = r4.size()
            if (r3 >= r4) goto Ld2
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r4 = r12.trackGroups
            java.lang.Object r4 = r4.get(r3)
            com.google.android.exoplayer2.Tracks$Group r4 = (com.google.android.exoplayer2.Tracks.Group) r4
            boolean r5 = r12.shouldEnableAdaptiveSelection(r4)
            android.widget.CheckedTextView[][] r6 = r12.trackViews
            int r7 = r4.length
            android.widget.CheckedTextView[] r8 = new android.widget.CheckedTextView[r7]
            r6[r3] = r8
            com.google.android.exoplayer2.ui.TrackSelectionView$TrackInfo[] r6 = new com.google.android.exoplayer2.ui.TrackSelectionView.TrackInfo[r7]
            r8 = 0
        L5b:
            int r9 = r4.length
            if (r8 >= r9) goto L69
            com.google.android.exoplayer2.ui.TrackSelectionView$TrackInfo r9 = new com.google.android.exoplayer2.ui.TrackSelectionView$TrackInfo
            r9.<init>(r4, r8)
            r6[r8] = r9
            int r8 = r8 + 1
            goto L5b
        L69:
            java.util.Comparator<com.google.android.exoplayer2.ui.TrackSelectionView$TrackInfo> r8 = r12.trackInfoComparator
            if (r8 == 0) goto L70
            java.util.Arrays.sort(r6, r8)
        L70:
            r8 = 0
        L71:
            if (r8 >= r7) goto Lce
            if (r8 != 0) goto L80
            android.view.LayoutInflater r9 = r12.inflater
            int r10 = com.google.android.exoplayer2.ui.R.layout.exo_list_divider
            android.view.View r9 = r9.inflate(r10, r12, r2)
            r12.addView(r9)
        L80:
            if (r5 != 0) goto L89
            if (r0 == 0) goto L85
            goto L89
        L85:
            r9 = 17367055(0x109000f, float:2.5162968E-38)
            goto L8c
        L89:
            r9 = 17367056(0x1090010, float:2.516297E-38)
        L8c:
            android.view.LayoutInflater r10 = r12.inflater
            android.view.View r9 = r10.inflate(r9, r12, r2)
            android.widget.CheckedTextView r9 = (android.widget.CheckedTextView) r9
            int r10 = r12.selectableItemBackgroundResourceId
            r9.setBackgroundResource(r10)
            com.google.android.exoplayer2.ui.TrackNameProvider r10 = r12.trackNameProvider
            r11 = r6[r8]
            com.google.android.exoplayer2.Format r11 = r11.getFormat()
            java.lang.String r10 = r10.getTrackName(r11)
            r9.setText(r10)
            r10 = r6[r8]
            r9.setTag(r10)
            boolean r10 = r4.isTrackSupported(r8)
            if (r10 == 0) goto Lbc
            r9.setFocusable(r1)
            com.google.android.exoplayer2.ui.TrackSelectionView$ComponentListener r10 = r12.componentListener
            r9.setOnClickListener(r10)
            goto Lc2
        Lbc:
            r9.setFocusable(r2)
            r9.setEnabled(r2)
        Lc2:
            android.widget.CheckedTextView[][] r10 = r12.trackViews
            r10 = r10[r3]
            r10[r8] = r9
            r12.addView(r9)
            int r8 = r8 + 1
            goto L71
        Lce:
            int r3 = r3 + 1
            goto L3c
        Ld2:
            r12.updateViewStates()
            return
    }

    public boolean getIsDisabled() {
            r1 = this;
            boolean r0 = r1.isDisabled
            return r0
    }

    public java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> getOverrides() {
            r1 = this;
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r1.overrides
            return r0
    }

    public void init(java.util.List<com.google.android.exoplayer2.Tracks.Group> r1, boolean r2, java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3, @androidx.annotation.Nullable java.util.Comparator<com.google.android.exoplayer2.Format> r4, @androidx.annotation.Nullable com.google.android.exoplayer2.ui.TrackSelectionView.TrackSelectionListener r5) {
            r0 = this;
            r0.isDisabled = r2
            if (r4 != 0) goto L6
            r2 = 0
            goto Lb
        L6:
            com.google.android.exoplayer2.ui.TrackSelectionView$$ExternalSyntheticLambda0 r2 = new com.google.android.exoplayer2.ui.TrackSelectionView$$ExternalSyntheticLambda0
            r2.<init>(r4)
        Lb:
            r0.trackInfoComparator = r2
            r0.listener = r5
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r2 = r0.trackGroups
            r2.clear()
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r2 = r0.trackGroups
            r2.addAll(r1)
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = r0.overrides
            r2.clear()
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2 = r0.overrides
            boolean r4 = r0.allowMultipleOverrides
            java.util.Map r1 = filterOverrides(r3, r1, r4)
            r2.putAll(r1)
            r0.updateViews()
            return
    }

    public void setAllowAdaptiveSelections(boolean r2) {
            r1 = this;
            boolean r0 = r1.allowAdaptiveSelections
            if (r0 == r2) goto L9
            r1.allowAdaptiveSelections = r2
            r1.updateViews()
        L9:
            return
    }

    public void setAllowMultipleOverrides(boolean r3) {
            r2 = this;
            boolean r0 = r2.allowMultipleOverrides
            if (r0 == r3) goto L27
            r2.allowMultipleOverrides = r3
            if (r3 != 0) goto L24
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r2.overrides
            int r3 = r3.size()
            r0 = 1
            if (r3 <= r0) goto L24
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r2.overrides
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r0 = r2.trackGroups
            r1 = 0
            java.util.Map r3 = filterOverrides(r3, r0, r1)
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r2.overrides
            r0.clear()
            java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r0 = r2.overrides
            r0.putAll(r3)
        L24:
            r2.updateViews()
        L27:
            return
    }

    public void setShowDisableOption(boolean r2) {
            r1 = this;
            android.widget.CheckedTextView r0 = r1.disableView
            if (r2 == 0) goto L6
            r2 = 0
            goto L8
        L6:
            r2 = 8
        L8:
            r0.setVisibility(r2)
            return
    }

    public void setTrackNameProvider(com.google.android.exoplayer2.ui.TrackNameProvider r1) {
            r0 = this;
            java.lang.Object r1 = com.google.android.exoplayer2.util.Assertions.checkNotNull(r1)
            com.google.android.exoplayer2.ui.TrackNameProvider r1 = (com.google.android.exoplayer2.ui.TrackNameProvider) r1
            r0.trackNameProvider = r1
            r0.updateViews()
            return
    }
}
