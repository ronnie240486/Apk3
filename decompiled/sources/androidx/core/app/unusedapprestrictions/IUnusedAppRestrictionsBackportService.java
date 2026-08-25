package androidx.core.app.unusedapprestrictions;

/* JADX INFO: loaded from: classes2.dex */
public interface IUnusedAppRestrictionsBackportService extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService";

    /* JADX INFO: loaded from: classes.dex */
    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
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

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
        public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {

        /* JADX INFO: loaded from: classes2.dex */
        public static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService {
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
                    java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
                    return r0
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
            public void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r4) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L17
                    r0.writeStrongInterface(r4)     // Catch: java.lang.Throwable -> L17
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L17
                    r1 = 0
                    r2 = 1
                    r4.transact(r2, r0, r1, r2)     // Catch: java.lang.Throwable -> L17
                    r0.recycle()
                    return
                L17:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService
                if (r1 == 0) goto L13
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService r0 = (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService) r0
                return r0
            L13:
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub$Proxy r0 = new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService$Stub$Proxy
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
                java.lang.String r1 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportService"
                if (r4 < r0) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r1)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L25
                if (r4 == r0) goto L19
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L19:
                android.os.IBinder r4 = r5.readStrongBinder()
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r4 = androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback.Stub.asInterface(r4)
                r3.isPermissionRevocationEnabledForApp(r4)
                return r0
            L25:
                r6.writeString(r1)
                return r0
        }
    }

    void isPermissionRevocationEnabledForApp(androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r1) throws android.os.RemoteException;
}
