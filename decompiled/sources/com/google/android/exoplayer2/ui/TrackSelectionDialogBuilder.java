package com.google.android.exoplayer2.ui;

/* JADX INFO: loaded from: classes.dex */
public final class TrackSelectionDialogBuilder {
    private boolean allowAdaptiveSelections;
    private boolean allowMultipleOverrides;
    private final com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback callback;
    private final android.content.Context context;
    private boolean isDisabled;
    private com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> overrides;
    private boolean showDisableOption;

    @androidx.annotation.StyleRes
    private int themeResId;
    private final java.lang.CharSequence title;

    @androidx.annotation.Nullable
    private java.util.Comparator<com.google.android.exoplayer2.Format> trackFormatComparator;
    private final java.util.List<com.google.android.exoplayer2.Tracks.Group> trackGroups;

    @androidx.annotation.Nullable
    private com.google.android.exoplayer2.ui.TrackNameProvider trackNameProvider;

    /* JADX INFO: loaded from: classes3.dex */
    public interface DialogCallback {
        void onTracksSelected(boolean r1, java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r2);
    }

    /* JADX INFO: renamed from: $r8$lambda$g-_YT-UXcDk5hlbm87RlAP42a4s, reason: not valid java name */
    public static /* synthetic */ void m270$r8$lambda$g_YTUXcDk5hlbm87RlAP42a4s(com.google.android.exoplayer2.Player r0, int r1, boolean r2, java.util.Map r3) {
            lambda$new$0(r0, r1, r2, r3)
            return
    }

    public static /* synthetic */ void $r8$lambda$mQ8ceAtPXiWN3OCF0Sqt_ogHgiE(com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder r0, com.google.android.exoplayer2.ui.TrackSelectionView r1, android.content.DialogInterface r2, int r3) {
            r0.lambda$setUpDialogView$1(r1, r2, r3)
            return
    }

    public TrackSelectionDialogBuilder(android.content.Context r3, java.lang.CharSequence r4, com.google.android.exoplayer2.Player r5, int r6) {
            r2 = this;
            r2.<init>()
            r2.context = r3
            r2.title = r4
            r3 = 30
            boolean r3 = r5.isCommandAvailable(r3)
            if (r3 == 0) goto L14
            com.google.android.exoplayer2.Tracks r3 = r5.getCurrentTracks()
            goto L16
        L14:
            com.google.android.exoplayer2.Tracks r3 = com.google.android.exoplayer2.Tracks.EMPTY
        L16:
            com.google.common.collect.ImmutableList r3 = r3.getGroups()
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r2.trackGroups = r4
            r4 = 0
        L22:
            int r0 = r3.size()
            if (r4 >= r0) goto L3c
            java.lang.Object r0 = r3.get(r4)
            com.google.android.exoplayer2.Tracks$Group r0 = (com.google.android.exoplayer2.Tracks.Group) r0
            int r1 = r0.getType()
            if (r1 != r6) goto L39
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r1 = r2.trackGroups
            r1.add(r0)
        L39:
            int r4 = r4 + 1
            goto L22
        L3c:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r3 = r5.getTrackSelectionParameters()
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r3.overrides
            r2.overrides = r3
            com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda1 r3 = new com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda1
            r3.<init>(r5, r6)
            r2.callback = r3
            return
    }

    public TrackSelectionDialogBuilder(android.content.Context r1, java.lang.CharSequence r2, java.util.List<com.google.android.exoplayer2.Tracks.Group> r3, com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder.DialogCallback r4) {
            r0 = this;
            r0.<init>()
            r0.context = r1
            r0.title = r2
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r3)
            r0.trackGroups = r1
            r0.callback = r4
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.of()
            r0.overrides = r1
            return
    }

    @androidx.annotation.Nullable
    private android.app.Dialog buildForAndroidX() {
            r12 = this;
            r0 = 0
            java.lang.Class<androidx.appcompat.app.AlertDialog$Builder> r1 = androidx.appcompat.app.AlertDialog.Builder.class
            r2 = 2
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Class<android.content.Context> r4 = android.content.Context.class
            r5 = 0
            r3[r5] = r4     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Class r4 = java.lang.Integer.TYPE     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r6 = 1
            r3[r6] = r4     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Constructor r3 = r1.getConstructor(r3)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r7 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            android.content.Context r8 = r12.context     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r7[r5] = r8     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            int r8 = r12.themeResId     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r7[r6] = r8     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object r3 = r3.newInstance(r7)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.String r7 = "getContext"
            java.lang.Class[] r8 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Method r7 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r8 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object r7 = r7.invoke(r3, r8)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            android.content.Context r7 = (android.content.Context) r7     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            android.view.LayoutInflater r7 = android.view.LayoutInflater.from(r7)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            int r8 = com.google.android.exoplayer2.ui.R.layout.exo_track_selection_dialog     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            android.view.View r7 = r7.inflate(r8, r0)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            android.content.DialogInterface$OnClickListener r8 = r12.setUpDialogView(r7)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.String r9 = "setTitle"
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Class<java.lang.CharSequence> r11 = java.lang.CharSequence.class
            r10[r5] = r11     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Method r9 = r1.getMethod(r9, r10)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.CharSequence r11 = r12.title     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r10[r5] = r11     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r9.invoke(r3, r10)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.String r9 = "setView"
            java.lang.Class[] r10 = new java.lang.Class[r6]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Class<android.view.View> r11 = android.view.View.class
            r10[r5] = r11     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Method r9 = r1.getMethod(r9, r10)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r10 = new java.lang.Object[r6]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r10[r5] = r7     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r9.invoke(r3, r10)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.String r7 = "setPositiveButton"
            java.lang.Class[] r9 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r9[r5] = r4     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Class<android.content.DialogInterface$OnClickListener> r10 = android.content.DialogInterface.OnClickListener.class
            r9[r6] = r10     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Method r7 = r1.getMethod(r7, r9)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r9 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r10 = 17039370(0x104000a, float:2.42446E-38)
            java.lang.Integer r10 = java.lang.Integer.valueOf(r10)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r9[r5] = r10     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r9[r6] = r8     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r7.invoke(r3, r9)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.String r7 = "setNegativeButton"
            java.lang.Class[] r8 = new java.lang.Class[r2]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r8[r5] = r4     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Class<android.content.DialogInterface$OnClickListener> r4 = android.content.DialogInterface.OnClickListener.class
            r8[r6] = r4     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Method r4 = r1.getMethod(r7, r8)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r7 = 17039360(0x1040000, float:2.424457E-38)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r2[r5] = r7     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r2[r6] = r0     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            r4.invoke(r3, r2)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.String r2 = "create"
            java.lang.Class[] r4 = new java.lang.Class[r5]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.reflect.Method r1 = r1.getMethod(r2, r4)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object[] r2 = new java.lang.Object[r5]     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            java.lang.Object r1 = r1.invoke(r3, r2)     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            android.app.Dialog r1 = (android.app.Dialog) r1     // Catch: java.lang.Exception -> Lbc java.lang.ClassNotFoundException -> Lc3
            return r1
        Lbc:
            r0 = move-exception
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            r1.<init>(r0)
            throw r1
        Lc3:
            return r0
    }

    private android.app.Dialog buildForPlatform() {
            r5 = this;
            android.app.AlertDialog$Builder r0 = new android.app.AlertDialog$Builder
            android.content.Context r1 = r5.context
            int r2 = r5.themeResId
            r0.<init>(r1, r2)
            android.content.Context r1 = r0.getContext()
            android.view.LayoutInflater r1 = android.view.LayoutInflater.from(r1)
            int r2 = com.google.android.exoplayer2.ui.R.layout.exo_track_selection_dialog
            r3 = 0
            android.view.View r1 = r1.inflate(r2, r3)
            android.content.DialogInterface$OnClickListener r2 = r5.setUpDialogView(r1)
            java.lang.CharSequence r4 = r5.title
            android.app.AlertDialog$Builder r0 = r0.setTitle(r4)
            android.app.AlertDialog$Builder r0 = r0.setView(r1)
            r1 = 17039370(0x104000a, float:2.42446E-38)
            android.app.AlertDialog$Builder r0 = r0.setPositiveButton(r1, r2)
            r1 = 17039360(0x1040000, float:2.424457E-38)
            android.app.AlertDialog$Builder r0 = r0.setNegativeButton(r1, r3)
            android.app.AlertDialog r0 = r0.create()
            return r0
    }

    private static /* synthetic */ void lambda$new$0(com.google.android.exoplayer2.Player r1, int r2, boolean r3, java.util.Map r4) {
            r0 = 29
            boolean r0 = r1.isCommandAvailable(r0)
            if (r0 != 0) goto L9
            return
        L9:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r0 = r1.getTrackSelectionParameters()
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters$Builder r0 = r0.buildUpon()
            r0.setTrackTypeDisabled(r2, r3)
            r0.clearOverridesOfType(r2)
            java.util.Collection r2 = r4.values()
            java.util.Iterator r2 = r2.iterator()
        L1f:
            boolean r3 = r2.hasNext()
            if (r3 == 0) goto L2f
            java.lang.Object r3 = r2.next()
            com.google.android.exoplayer2.trackselection.TrackSelectionOverride r3 = (com.google.android.exoplayer2.trackselection.TrackSelectionOverride) r3
            r0.addOverride(r3)
            goto L1f
        L2f:
            com.google.android.exoplayer2.trackselection.TrackSelectionParameters r2 = r0.build()
            r1.setTrackSelectionParameters(r2)
            return
    }

    private /* synthetic */ void lambda$setUpDialogView$1(com.google.android.exoplayer2.ui.TrackSelectionView r1, android.content.DialogInterface r2, int r3) {
            r0 = this;
            com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$DialogCallback r2 = r0.callback
            boolean r3 = r1.getIsDisabled()
            java.util.Map r1 = r1.getOverrides()
            r2.onTracksSelected(r3, r1)
            return
    }

    private android.content.DialogInterface.OnClickListener setUpDialogView(android.view.View r7) {
            r6 = this;
            int r0 = com.google.android.exoplayer2.ui.R.id.exo_track_selection_view
            android.view.View r7 = r7.findViewById(r0)
            com.google.android.exoplayer2.ui.TrackSelectionView r7 = (com.google.android.exoplayer2.ui.TrackSelectionView) r7
            boolean r0 = r6.allowMultipleOverrides
            r7.setAllowMultipleOverrides(r0)
            boolean r0 = r6.allowAdaptiveSelections
            r7.setAllowAdaptiveSelections(r0)
            boolean r0 = r6.showDisableOption
            r7.setShowDisableOption(r0)
            com.google.android.exoplayer2.ui.TrackNameProvider r0 = r6.trackNameProvider
            if (r0 == 0) goto L1e
            r7.setTrackNameProvider(r0)
        L1e:
            java.util.List<com.google.android.exoplayer2.Tracks$Group> r1 = r6.trackGroups
            boolean r2 = r6.isDisabled
            com.google.common.collect.ImmutableMap<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r3 = r6.overrides
            java.util.Comparator<com.google.android.exoplayer2.Format> r4 = r6.trackFormatComparator
            r5 = 0
            r0 = r7
            r0.init(r1, r2, r3, r4, r5)
            com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda0 r0 = new com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder$$ExternalSyntheticLambda0
            r0.<init>(r6, r7)
            return r0
    }

    public android.app.Dialog build() {
            r1 = this;
            android.app.Dialog r0 = r1.buildForAndroidX()
            if (r0 != 0) goto La
            android.app.Dialog r0 = r1.buildForPlatform()
        La:
            return r0
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setAllowAdaptiveSelections(boolean r1) {
            r0 = this;
            r0.allowAdaptiveSelections = r1
            return r0
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setAllowMultipleOverrides(boolean r1) {
            r0 = this;
            r0.allowMultipleOverrides = r1
            return r0
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setIsDisabled(boolean r1) {
            r0 = this;
            r0.isDisabled = r1
            return r0
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setOverride(@androidx.annotation.Nullable com.google.android.exoplayer2.trackselection.TrackSelectionOverride r2) {
            r1 = this;
            if (r2 != 0) goto L7
            java.util.Map r2 = java.util.Collections.emptyMap()
            goto Ld
        L7:
            com.google.android.exoplayer2.source.TrackGroup r0 = r2.mediaTrackGroup
            com.google.common.collect.ImmutableMap r2 = com.google.common.collect.ImmutableMap.of(r0, r2)
        Ld:
            com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder r2 = r1.setOverrides(r2)
            return r2
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setOverrides(java.util.Map<com.google.android.exoplayer2.source.TrackGroup, com.google.android.exoplayer2.trackselection.TrackSelectionOverride> r1) {
            r0 = this;
            com.google.common.collect.ImmutableMap r1 = com.google.common.collect.ImmutableMap.copyOf(r1)
            r0.overrides = r1
            return r0
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setShowDisableOption(boolean r1) {
            r0 = this;
            r0.showDisableOption = r1
            return r0
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setTheme(@androidx.annotation.StyleRes int r1) {
            r0 = this;
            r0.themeResId = r1
            return r0
    }

    public void setTrackFormatComparator(@androidx.annotation.Nullable java.util.Comparator<com.google.android.exoplayer2.Format> r1) {
            r0 = this;
            r0.trackFormatComparator = r1
            return
    }

    public com.google.android.exoplayer2.ui.TrackSelectionDialogBuilder setTrackNameProvider(@androidx.annotation.Nullable com.google.android.exoplayer2.ui.TrackNameProvider r1) {
            r0 = this;
            r0.trackNameProvider = r1
            return r0
    }
}
