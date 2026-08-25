package com.google.android.exoplayer2.ui;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class DefaultTimeBar$$ExternalSyntheticLambda1 implements java.lang.Runnable {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ android.view.View f$0;

    public /* synthetic */ DefaultTimeBar$$ExternalSyntheticLambda1(android.view.View r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.lang.Runnable
    public final void run() {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L6;
                default: goto L5;
            }
        L5:
            goto Le
        L6:
            android.view.View r0 = r1.f$0
            com.google.android.exoplayer2.ui.DefaultTimeBar r0 = (com.google.android.exoplayer2.ui.DefaultTimeBar) r0
            com.google.android.exoplayer2.ui.DefaultTimeBar.$r8$lambda$0kViDiRVwCDE5XwNTNyFNxX8LLg(r0)
            return
        Le:
            android.view.View r0 = r1.f$0
            com.google.android.exoplayer2.ui.StyledPlayerControlView r0 = (com.google.android.exoplayer2.ui.StyledPlayerControlView) r0
            com.google.android.exoplayer2.ui.StyledPlayerControlView.m263$r8$lambda$dsDS5OYIroORhxkiiMevop7GuU(r0)
            return
    }
}
