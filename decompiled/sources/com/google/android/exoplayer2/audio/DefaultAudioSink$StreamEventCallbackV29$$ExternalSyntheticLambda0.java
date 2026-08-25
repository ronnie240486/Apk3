package com.google.android.exoplayer2.audio;

/* JADX INFO: compiled from: R8$$SyntheticClass */
/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0 implements java.util.concurrent.Executor {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ android.os.Handler f$0;

    public /* synthetic */ DefaultAudioSink$StreamEventCallbackV29$$ExternalSyntheticLambda0(android.os.Handler r1, int r2) {
            r0 = this;
            r0.$r8$classId = r2
            r0.f$0 = r1
            r0.<init>()
            return
    }

    @Override // java.util.concurrent.Executor
    public final void execute(java.lang.Runnable r2) {
            r1 = this;
            int r0 = r1.$r8$classId
            switch(r0) {
                case 0: goto L5;
                default: goto L5;
            }
        L5:
            android.os.Handler r0 = r1.f$0
            r0.post(r2)
            return
    }
}
