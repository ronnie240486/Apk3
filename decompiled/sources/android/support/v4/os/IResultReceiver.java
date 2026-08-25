package android.support.v4.os;

/* JADX INFO: loaded from: classes3.dex */
public interface IResultReceiver extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "android.support.v4.os.IResultReceiver";

    /* JADX INFO: loaded from: classes.dex */
    public static class Default implements android.support.v4.os.IResultReceiver {
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

        @Override // android.support.v4.os.IResultReceiver
        public void send(int r1, android.os.Bundle r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements android.support.v4.os.IResultReceiver {
        public static final int TRANSACTION_send = 1;

        /* JADX INFO: loaded from: classes.dex */
        public static class Proxy implements android.support.v4.os.IResultReceiver {
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

            public java.lang.String getInterfaceDescriptor() {
                    r1 = this;
                    java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                    return r0
            }

            @Override // android.support.v4.os.IResultReceiver
            public void send(int r3, android.os.Bundle r4) throws android.os.RemoteException {
                    r2 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "android.support.v4.os.IResultReceiver"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L1b
                    r0.writeInt(r3)     // Catch: java.lang.Throwable -> L1b
                    r3 = 0
                    android.support.v4.os.IResultReceiver._Parcel.access$100(r0, r4, r3)     // Catch: java.lang.Throwable -> L1b
                    android.os.IBinder r3 = r2.mRemote     // Catch: java.lang.Throwable -> L1b
                    r4 = 0
                    r1 = 1
                    r3.transact(r1, r0, r4, r1)     // Catch: java.lang.Throwable -> L1b
                    r0.recycle()
                    return
                L1b:
                    r3 = move-exception
                    r0.recycle()
                    throw r3
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                r1.attachInterface(r1, r0)
                return
        }

        public static android.support.v4.os.IResultReceiver asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "android.support.v4.os.IResultReceiver"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof android.support.v4.os.IResultReceiver
                if (r1 == 0) goto L13
                android.support.v4.os.IResultReceiver r0 = (android.support.v4.os.IResultReceiver) r0
                return r0
            L13:
                android.support.v4.os.IResultReceiver$Stub$Proxy r0 = new android.support.v4.os.IResultReceiver$Stub$Proxy
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
                java.lang.String r1 = "android.support.v4.os.IResultReceiver"
                if (r4 < r0) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r1)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L29
                if (r4 == r0) goto L19
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L19:
                int r4 = r5.readInt()
                android.os.Parcelable$Creator r6 = android.os.Bundle.CREATOR
                java.lang.Object r5 = android.support.v4.os.IResultReceiver._Parcel.access$000(r5, r6)
                android.os.Bundle r5 = (android.os.Bundle) r5
                r3.send(r4, r5)
                return r0
            L29:
                r6.writeString(r1)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
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

    void send(int r1, android.os.Bundle r2) throws android.os.RemoteException;
}
