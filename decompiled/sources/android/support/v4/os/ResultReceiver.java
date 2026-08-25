package android.support.v4.os;

/* JADX INFO: loaded from: classes.dex */
@android.annotation.SuppressLint({"BanParcelableUsage"})
@androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
public class ResultReceiver implements android.os.Parcelable {
    public static final android.os.Parcelable.Creator<android.support.v4.os.ResultReceiver> CREATOR = null;
    public final android.os.Handler mHandler;
    public final boolean mLocal;
    public android.support.v4.os.IResultReceiver mReceiver;


    public class MyResultReceiver extends android.support.v4.os.IResultReceiver.Stub {
        public final /* synthetic */ android.support.v4.os.ResultReceiver this$0;

        public MyResultReceiver(android.support.v4.os.ResultReceiver r1) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                return
        }

        @Override // android.support.v4.os.IResultReceiver
        public void send(int r4, android.os.Bundle r5) {
                r3 = this;
                android.support.v4.os.ResultReceiver r0 = r3.this$0
                android.os.Handler r1 = r0.mHandler
                if (r1 == 0) goto Lf
                android.support.v4.os.ResultReceiver$MyRunnable r2 = new android.support.v4.os.ResultReceiver$MyRunnable
                r2.<init>(r0, r4, r5)
                r1.post(r2)
                goto L12
            Lf:
                r0.onReceiveResult(r4, r5)
            L12:
                return
        }
    }

    public class MyRunnable implements java.lang.Runnable {
        public final int mResultCode;
        public final android.os.Bundle mResultData;
        public final /* synthetic */ android.support.v4.os.ResultReceiver this$0;

        public MyRunnable(android.support.v4.os.ResultReceiver r1, int r2, android.os.Bundle r3) {
                r0 = this;
                r0.this$0 = r1
                r0.<init>()
                r0.mResultCode = r2
                r0.mResultData = r3
                return
        }

        @Override // java.lang.Runnable
        public void run() {
                r3 = this;
                android.support.v4.os.ResultReceiver r0 = r3.this$0
                int r1 = r3.mResultCode
                android.os.Bundle r2 = r3.mResultData
                r0.onReceiveResult(r1, r2)
                return
        }
    }

    static {
            android.support.v4.os.ResultReceiver$1 r0 = new android.support.v4.os.ResultReceiver$1
            r0.<init>()
            android.support.v4.os.ResultReceiver.CREATOR = r0
            return
    }

    public ResultReceiver(android.os.Handler r2) {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.mLocal = r0
            r1.mHandler = r2
            return
    }

    public ResultReceiver(android.os.Parcel r2) {
            r1 = this;
            r1.<init>()
            r0 = 0
            r1.mLocal = r0
            r0 = 0
            r1.mHandler = r0
            android.os.IBinder r2 = r2.readStrongBinder()
            android.support.v4.os.IResultReceiver r2 = android.support.v4.os.IResultReceiver.Stub.asInterface(r2)
            r1.mReceiver = r2
            return
    }

    @Override // android.os.Parcelable
    public int describeContents() {
            r1 = this;
            r0 = 0
            return r0
    }

    public void onReceiveResult(int r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public void send(int r3, android.os.Bundle r4) {
            r2 = this;
            boolean r0 = r2.mLocal
            if (r0 == 0) goto L15
            android.os.Handler r0 = r2.mHandler
            if (r0 == 0) goto L11
            android.support.v4.os.ResultReceiver$MyRunnable r1 = new android.support.v4.os.ResultReceiver$MyRunnable
            r1.<init>(r2, r3, r4)
            r0.post(r1)
            goto L14
        L11:
            r2.onReceiveResult(r3, r4)
        L14:
            return
        L15:
            android.support.v4.os.IResultReceiver r0 = r2.mReceiver
            if (r0 == 0) goto L1c
            r0.send(r3, r4)     // Catch: android.os.RemoteException -> L1c
        L1c:
            return
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@androidx.annotation.NonNull android.os.Parcel r1, int r2) {
            r0 = this;
            monitor-enter(r0)
            android.support.v4.os.IResultReceiver r2 = r0.mReceiver     // Catch: java.lang.Throwable -> L17
            if (r2 != 0) goto Lc
            android.support.v4.os.ResultReceiver$MyResultReceiver r2 = new android.support.v4.os.ResultReceiver$MyResultReceiver     // Catch: java.lang.Throwable -> L17
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L17
            r0.mReceiver = r2     // Catch: java.lang.Throwable -> L17
        Lc:
            android.support.v4.os.IResultReceiver r2 = r0.mReceiver     // Catch: java.lang.Throwable -> L17
            android.os.IBinder r2 = r2.asBinder()     // Catch: java.lang.Throwable -> L17
            r1.writeStrongBinder(r2)     // Catch: java.lang.Throwable -> L17
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            return
        L17:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L17
            throw r1
    }
}
