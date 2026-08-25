package android.support.v4.app;

/* JADX INFO: loaded from: classes2.dex */
public interface INotificationSideChannel extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.support.v4.app.INotificationSideChannel";

    public static class Default implements android.support.v4.app.INotificationSideChannel {
        public Default() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r1 = this;
                r0 = 0
                return r0
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancel(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void cancelAll(java.lang.String r1) throws android.os.RemoteException {
                r0 = this;
                return
        }

        @Override // android.support.v4.app.INotificationSideChannel
        public void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Stub extends android.os.Binder implements android.support.v4.app.INotificationSideChannel {
        public static final int TRANSACTION_cancel = 2;
        public static final int TRANSACTION_cancelAll = 3;
        public static final int TRANSACTION_notify = 1;

        /* JADX INFO: loaded from: classes2.dex */
        public static class Proxy implements android.support.v4.app.INotificationSideChannel {
            private android.os.IBinder mRemote;

            public Proxy(android.os.IBinder r1) {
                    r0 = this;
                    r0.<init>()
                    r0.mRemote = r1
                    return
            }

            @Override // android.os.IInterface
            public android.os.IBinder asBinder() {
                    r1 = this;
                    android.os.IBinder r0 = r1.mRemote
                    return r0
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancel(java.lang.String r3, int r4, java.lang.String r5) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1e
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L1e
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L1e
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L1e
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L1e
                    r4 = 2
                    r5 = 0
                    r1 = 1
                    r3.transact(r4, r0, r5, r1)     // Catch: java.lang.Throwable -> L1e
                    r0.recycle()
                    return
                L1e:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void cancelAll(java.lang.String r5) throws android.os.RemoteException {
                    r4 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L18
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L18
                    android.os.IBinder r5 = r4.mRemote     // Catch: java.lang.Throwable -> L18
                    r1 = 3
                    r2 = 0
                    r3 = 1
                    r5.transact(r1, r0, r2, r3)     // Catch: java.lang.Throwable -> L18
                    r0.recycle()
                    return
                L18:
                    r5 = move-exception
                    r0.recycle()
                    throw r5
            }

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "android.support.v4.app.INotificationSideChannel"
                    return r0
            }

            @Override // android.support.v4.app.INotificationSideChannel
            public void notify(java.lang.String r3, int r4, java.lang.String r5, android.app.Notification r6) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L21
                    r0.writeString(r3)     // Catch: java.lang.Throwable -> L21
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L21
                    r0.writeString(r5)     // Catch: java.lang.Throwable -> L21
                    r3 = 0
                    android.support.v4.app.INotificationSideChannel._Parcel.access$100(r0, r6, r3)     // Catch: java.lang.Throwable -> L21
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L21
                    r4 = 0
                    r5 = 1
                    r3.transact(r5, r0, r4, r5)     // Catch: java.lang.Throwable -> L21
                    r0.recycle()
                    return
                L21:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.app.INotificationSideChannel"
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.app.INotificationSideChannel asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.app.INotificationSideChannel"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.app.INotificationSideChannel
                if (r1 == 0) goto L13
                android.support.v4.app.INotificationSideChannel r0 = (android.support.v4.app.INotificationSideChannel) r0
                return r0
            L13:
                android.support.v4.app.INotificationSideChannel$Stub$Proxy r0 = new android.support.v4.app.INotificationSideChannel$Stub$Proxy
                r0.<init>(r2)
                return r0
        }

        @Override // android.os.IInterface
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public boolean onTransact(int r4, android.os.Parcel r5, android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                r0 = 1
                java.lang.String r1 = "android.support.v4.app.INotificationSideChannel"
                if (r4 < r0) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r1)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L4f
                if (r4 == r0) goto L37
                r1 = 2
                if (r4 == r1) goto L27
                r1 = 3
                if (r4 == r1) goto L1f
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L1f:
                java.lang.String r4 = r5.readString()
                r3.cancelAll(r4)
                goto L4e
            L27:
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                java.lang.String r5 = r5.readString()
                r3.cancel(r4, r6, r5)
                goto L4e
            L37:
                java.lang.String r4 = r5.readString()
                int r6 = r5.readInt()
                java.lang.String r7 = r5.readString()
                android.os.Parcelable$Creator r1 = android.app.Notification.CREATOR
                java.lang.Object r5 = android.support.v4.app.INotificationSideChannel._Parcel.access$000(r5, r1)
                android.app.Notification r5 = (android.app.Notification) r5
                r3.notify(r4, r6, r7, r5)
            L4e:
                return r0
            L4f:
                r6.writeString(r1)
                return r0
        }
    }

    public static class _Parcel {
        public _Parcel() {
                r0 = this;
                r0.<init>()
                return
        }

        public static /* synthetic */ java.lang.Object access$000(android.os.Parcel r0, android.os.Parcelable.Creator r1) {
                java.lang.Object r0 = readTypedObject(r0, r1)
                return r0
        }

        public static /* synthetic */ void access$100(android.os.Parcel r0, android.os.Parcelable r1, int r2) {
                writeTypedObject(r0, r1, r2)
                return
        }

        private static <T> T readTypedObject(android.os.Parcel r1, android.os.Parcelable.Creator<T> r2) {
                int r0 = r1.readInt()
                if (r0 == 0) goto Lb
                java.lang.Object r1 = r2.createFromParcel(r1)
                return r1
            Lb:
                r1 = 0
                return r1
        }

        private static <T extends android.os.Parcelable> void writeTypedObject(android.os.Parcel r1, T r2, int r3) {
                if (r2 == 0) goto La
                r0 = 1
                r1.writeInt(r0)
                r2.writeToParcel(r1, r3)
                goto Le
            La:
                r2 = 0
                r1.writeInt(r2)
            Le:
                return
        }
    }

    void cancel(java.lang.String r1, int r2, java.lang.String r3) throws android.os.RemoteException;

    void cancelAll(java.lang.String r1) throws android.os.RemoteException;

    void notify(java.lang.String r1, int r2, java.lang.String r3, android.app.Notification r4) throws android.os.RemoteException;
}
