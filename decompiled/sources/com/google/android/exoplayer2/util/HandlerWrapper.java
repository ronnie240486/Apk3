package com.google.android.exoplayer2.util;

/* JADX INFO: loaded from: classes3.dex */
public interface HandlerWrapper {

    public interface Message {
        com.google.android.exoplayer2.util.HandlerWrapper getTarget();

        void sendToTarget();
    }

    android.os.Looper getLooper();

    boolean hasMessages(int r1);

    com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r1);

    com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r1, int r2, int r3);

    com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r1, int r2, int r3, @androidx.annotation.Nullable java.lang.Object r4);

    com.google.android.exoplayer2.util.HandlerWrapper.Message obtainMessage(int r1, @androidx.annotation.Nullable java.lang.Object r2);

    boolean post(java.lang.Runnable r1);

    boolean postAtFrontOfQueue(java.lang.Runnable r1);

    boolean postDelayed(java.lang.Runnable r1, long r2);

    void removeCallbacksAndMessages(@androidx.annotation.Nullable java.lang.Object r1);

    void removeMessages(int r1);

    boolean sendEmptyMessage(int r1);

    boolean sendEmptyMessageAtTime(int r1, long r2);

    boolean sendEmptyMessageDelayed(int r1, int r2);

    boolean sendMessageAtFrontOfQueue(com.google.android.exoplayer2.util.HandlerWrapper.Message r1);
}
