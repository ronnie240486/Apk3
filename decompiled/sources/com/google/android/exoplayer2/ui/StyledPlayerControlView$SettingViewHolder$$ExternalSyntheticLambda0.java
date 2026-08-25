package com.google.android.exoplayer2.ui;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0 implements android.view.View.OnClickListener {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ java.lang.Object f$0;

    public /* synthetic */ StyledPlayerControlView$SettingViewHolder$$ExternalSyntheticLambda0(java.lang.Object r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(android.view.View r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto Le;
                case 1: goto L6;
                default: goto L5;
            }
        L5:
            goto L16
        L6:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$AudioTrackSelectionAdapter r0 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter) r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView.AudioTrackSelectionAdapter.m264$r8$lambda$pqvoHakFH23jakaLsw4ioLGV0(r0, r2)
            return
        Le:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$SettingViewHolder r0 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder) r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView.SettingViewHolder.m266$r8$lambda$ADkzLrF5UCEMDSG997fZB1ITB0(r0, r2)
            return
        L16:
            java.lang.Object r0 = r1.f$0
            com.google.android.exoplayer2.ui.StyledPlayerControlView$TextTrackSelectionAdapter r0 = (com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter) r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView.TextTrackSelectionAdapter.$r8$lambda$uMwX70AwZEMrSXo0fgYYbjR5mGs(r0, r2)
            return
    }
}
