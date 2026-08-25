package androidx.core.app.unusedapprestrictions;

/* JADX INFO: loaded from: classes.dex */
public interface IUnusedAppRestrictionsBackportCallback extends android.os.IInterface {
    public static final java.lang.String DESCRIPTOR = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback";

    public static class Default implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
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

        @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
        public void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws android.os.RemoteException {
                r0 = this;
                return
        }
    }

    public static abstract class Stub extends android.os.Binder implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {

        public static class Proxy implements androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback {
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
                    java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback"
                    return r0
            }

            @Override // androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
            public void onIsPermissionRevocationEnabledForAppResult(boolean r4, boolean r5) throws android.os.RemoteException {
                    r3 = this;
                    android.os.Parcel r0 = android.os.Parcel.obtain()
                    java.lang.String r1 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback"
                    r0.writeInterfaceToken(r1)     // Catch: java.lang.Throwable -> L23
                    r1 = 0
                    r2 = 1
                    if (r4 == 0) goto Lf
                    r4 = 1
                    goto L10
                Lf:
                    r4 = 0
                L10:
                    r0.writeInt(r4)     // Catch: java.lang.Throwable -> L23
                    if (r5 == 0) goto L16
                    r1 = 1
                L16:
                    r0.writeInt(r1)     // Catch: java.lang.Throwable -> L23
                    android.os.IBinder r4 = r3.mRemote     // Catch: java.lang.Throwable -> L23
                    r5 = 0
                    r4.transact(r2, r0, r5, r2)     // Catch: java.lang.Throwable -> L23
                    r0.recycle()
                    return
                L23:
                    r4 = move-exception
                    r0.recycle()
                    throw r4
            }
        }

        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback"
                r1.attachInterface(r1, r0)
                return
        }

        public static androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback asInterface(android.os.IBinder r2) {
                if (r2 != 0) goto L4
                r2 = 0
                return r2
            L4:
                java.lang.String r0 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback"
                android.os.IInterface r0 = r2.queryLocalInterface(r0)
                if (r0 == 0) goto L13
                boolean r1 = r0 instanceof androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback
                if (r1 == 0) goto L13
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback r0 = (androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback) r0
                return r0
            L13:
                androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy r0 = new androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback$Stub$Proxy
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
                java.lang.String r1 = "androidx.core.app.unusedapprestrictions.IUnusedAppRestrictionsBackportCallback"
                if (r4 < r0) goto Ld
                r2 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 > r2) goto Ld
                r5.enforceInterface(r1)
            Ld:
                r2 = 1598968902(0x5f4e5446, float:1.4867585E19)
                if (r4 == r2) goto L2e
                if (r4 == r0) goto L19
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            L19:
                int r4 = r5.readInt()
                r6 = 0
                if (r4 == 0) goto L22
                r4 = 1
                goto L23
            L22:
                r4 = 0
            L23:
                int r5 = r5.readInt()
                if (r5 == 0) goto L2a
                r6 = 1
            L2a:
                r3.onIsPermissionRevocationEnabledForAppResult(r4, r6)
                return r0
            L2e:
                r6.writeString(r1)
                return r0
        }
    }

    void onIsPermissionRevocationEnabledForAppResult(boolean r1, boolean r2) throws android.os.RemoteException;
}
