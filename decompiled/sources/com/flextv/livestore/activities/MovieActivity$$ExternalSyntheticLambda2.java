package com.flextv.livestore.activities;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class MovieActivity$$ExternalSyntheticLambda2 implements androidx.constraintlayout.core.state.Interpolator, androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener, androidx.activity.result.ActivityResultCallback, com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener, com.flextv.livestore.remote.GetSubtitleLoginRequest.OnGetLinkModelListener, com.flextv.livestore.dlgfragment.SelectColorDlgFragment.ChangeColorListener, com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter, com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory, com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener, androidx.core.view.accessibility.AccessibilityViewCommand {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ MovieActivity$$ExternalSyntheticLambda2(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // com.flextv.livestore.remote.GetSubtitleLoginRequest.OnGetLinkModelListener
    public final void OnGetLinkModelResult(org.json.JSONObject r2, int r3) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.MovieActivity r0 = (com.flextv.livestore.activities.MovieActivity) r0
            com.flextv.livestore.activities.MovieActivity.$r8$lambda$MszIH7PMyqUxhuWWA6xWaGiowg8(r0, r2, r3)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.SeriesActivity r0 = (com.flextv.livestore.activities.SeriesActivity) r0
            com.flextv.livestore.activities.SeriesActivity.m71$r8$lambda$JL08aCa39IO2gpfLorPhyqlTY4(r0, r2, r3)
            return
    }

    @Override // com.google.android.exoplayer2.trackselection.TrackSelectionUtil.AdaptiveTrackSelectionFactory
    public final com.google.android.exoplayer2.trackselection.ExoTrackSelection createAdaptiveTrackSelection(com.google.android.exoplayer2.trackselection.ExoTrackSelection.Definition r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.trackselection.RandomTrackSelection$Factory r0 = (com.google.android.exoplayer2.trackselection.RandomTrackSelection.Factory) r0
            com.google.android.exoplayer2.trackselection.ExoTrackSelection r2 = com.google.android.exoplayer2.trackselection.RandomTrackSelection.Factory.$r8$lambda$daPFkhyilSrce3G1vNzNsPVQBCs(r0, r2)
            return r2
    }

    @Override // androidx.constraintlayout.core.state.Interpolator
    public final float getInterpolation(float r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            java.lang.String r0 = (java.lang.String) r0
            float r2 = androidx.constraintlayout.core.state.Transition.$r8$lambda$jXM2vb2eju1USPXMc6tRUnJaYj0(r0, r2)
            return r2
    }

    @Override // androidx.activity.result.ActivityResultCallback
    public final void onActivityResult(java.lang.Object r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.CategoryActivity r0 = (com.flextv.livestore.activities.CategoryActivity) r0
            androidx.activity.result.ActivityResult r2 = (androidx.activity.result.ActivityResult) r2
            com.flextv.livestore.activities.CategoryActivity.$r8$lambda$_Is5RkSmGzFKH9AxnXxiOvfnomA(r0, r2)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.SelectColorDlgFragment.ChangeColorListener
    public final void onChangeColor() {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment r0 = (com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment) r0
            com.flextv.livestore.dlgfragment.SubtitleSettingDlgFragment.$r8$lambda$fYkze2Zf1bZ3K4c7k7kANToQPL4(r0)
            return
    }

    @Override // androidx.core.view.inputmethod.InputConnectionCompat.OnCommitContentListener
    public final boolean onCommitContent(androidx.core.view.inputmethod.InputContentInfoCompat r2, int r3, android.os.Bundle r4) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            android.view.View r0 = (android.view.View) r0
            boolean r2 = androidx.core.view.inputmethod.InputConnectionCompat.$r8$lambda$KpUNHX7G_3SrNfrFIzMfcFEp1Cw(r0, r2, r3, r4)
            return r2
    }

    @Override // com.google.android.exoplayer2.video.VideoFrameReleaseHelper.DisplayHelper.Listener
    public final void onDefaultDisplayChanged(android.view.Display r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper r0 = (com.google.android.exoplayer2.video.VideoFrameReleaseHelper) r0
            com.google.android.exoplayer2.video.VideoFrameReleaseHelper.$r8$lambda$A5Zm0DOJniOJatrcB4x11ZTkanw(r0, r2)
            return
    }

    @Override // com.flextv.livestore.dlgfragment.NoConnectionDlgFragment.OnRetryClickListener
    public final void onRetryClick() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 4: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.activities.ChangePlaylistActivity r0 = (com.flextv.livestore.activities.ChangePlaylistActivity) r0
            com.flextv.livestore.activities.ChangePlaylistActivity.$r8$lambda$kduY8luUhxx8n5Av10Ea7A3mmEE(r0)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment r0 = (com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment) r0
            com.flextv.livestore.dlgfragment.AddPlaylistDlgFragment.$r8$lambda$NdtwcmTEv2ewAwNTlMpf6unx6xk(r0)
            return
    }

    @Override // androidx.core.view.accessibility.AccessibilityViewCommand
    public final boolean perform(android.view.View r2, androidx.core.view.accessibility.AccessibilityViewCommand.CommandArguments r3) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.material.bottomsheet.BottomSheetDragHandleView r0 = (com.google.android.material.bottomsheet.BottomSheetDragHandleView) r0
            boolean r2 = com.google.android.material.bottomsheet.BottomSheetDragHandleView.m281$r8$lambda$xAnba4Gk3yqfHJB7SUvsig1zc(r0, r2, r3)
            return r2
    }

    @Override // com.google.android.exoplayer2.extractor.BinarySearchSeeker.SeekTimestampConverter
    public final long timeUsToTargetTime(long r2) {
            r1 = this;
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.extractor.FlacStreamMetadata r0 = (com.google.android.exoplayer2.extractor.FlacStreamMetadata) r0
            long r2 = r0.getSampleNumber(r2)
            return r2
    }
}
