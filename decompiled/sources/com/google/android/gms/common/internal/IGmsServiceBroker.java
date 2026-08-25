package com.google.android.gms.common.internal;

/* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
/* JADX INFO: loaded from: classes2.dex */
public interface IGmsServiceBroker extends android.os.IInterface {

    /* JADX INFO: compiled from: com.google.android.gms:play-services-basement@@18.0.0 */
    /* JADX INFO: loaded from: classes.dex */
    public static abstract class Stub extends android.os.Binder implements com.google.android.gms.common.internal.IGmsServiceBroker {
        public Stub() {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r1.attachInterface(r1, r0)
                return
        }

        @Override // android.os.IInterface
        @androidx.annotation.NonNull
        @com.google.android.gms.common.annotation.KeepForSdk
        public android.os.IBinder asBinder() {
                r0 = this;
                return r0
        }

        @Override // android.os.Binder
        public final boolean onTransact(int r4, @androidx.annotation.NonNull android.os.Parcel r5, @androidx.annotation.Nullable android.os.Parcel r6, int r7) throws android.os.RemoteException {
                r3 = this;
                r0 = 16777215(0xffffff, float:2.3509886E-38)
                if (r4 <= r0) goto La
                boolean r4 = super.onTransact(r4, r5, r6, r7)
                return r4
            La:
                java.lang.String r7 = "com.google.android.gms.common.internal.IGmsServiceBroker"
                r5.enforceInterface(r7)
                android.os.IBinder r7 = r5.readStrongBinder()
                r0 = 0
                if (r7 != 0) goto L18
                r1 = r0
                goto L2a
            L18:
                java.lang.String r1 = "com.google.android.gms.common.internal.IGmsCallbacks"
                android.os.IInterface r1 = r7.queryLocalInterface(r1)
                boolean r2 = r1 instanceof com.google.android.gms.common.internal.IGmsCallbacks
                if (r2 == 0) goto L25
                com.google.android.gms.common.internal.IGmsCallbacks r1 = (com.google.android.gms.common.internal.IGmsCallbacks) r1
                goto L2a
            L25:
                com.google.android.gms.common.internal.zzaa r1 = new com.google.android.gms.common.internal.zzaa
                r1.<init>(r7)
            L2a:
                r7 = 46
                r2 = 1
                if (r4 != r7) goto L48
                int r4 = r5.readInt()
                if (r4 == 0) goto L3e
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.GetServiceRequest> r4 = com.google.android.gms.common.internal.GetServiceRequest.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                r0 = r4
                com.google.android.gms.common.internal.GetServiceRequest r0 = (com.google.android.gms.common.internal.GetServiceRequest) r0
            L3e:
                r3.getService(r1, r0)
                com.google.android.gms.common.internal.Preconditions.checkNotNull(r6)
                r6.writeNoException()
                return r2
            L48:
                r6 = 47
                if (r4 != r6) goto L60
                int r4 = r5.readInt()
                if (r4 == 0) goto L5a
                android.os.Parcelable$Creator<com.google.android.gms.common.internal.zzaj> r4 = com.google.android.gms.common.internal.zzaj.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                com.google.android.gms.common.internal.zzaj r4 = (com.google.android.gms.common.internal.zzaj) r4
            L5a:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
            L60:
                r5.readInt()
                r6 = 4
                if (r4 == r6) goto L10d
                r5.readString()
                if (r4 == r2) goto Lf6
                r6 = 2
                if (r4 == r6) goto Le7
                r6 = 23
                if (r4 == r6) goto Le7
                r6 = 25
                if (r4 == r6) goto Le7
                r6 = 27
                if (r4 == r6) goto Le7
                r6 = 30
                if (r4 == r6) goto Ld2
                r6 = 34
                if (r4 == r6) goto Lce
                r6 = 41
                if (r4 == r6) goto Le7
                r6 = 43
                if (r4 == r6) goto Le7
                r6 = 37
                if (r4 == r6) goto Le7
                r6 = 38
                if (r4 == r6) goto Le7
                switch(r4) {
                    case 5: goto Le7;
                    case 6: goto Le7;
                    case 7: goto Le7;
                    case 8: goto Le7;
                    case 9: goto Lb0;
                    case 10: goto La9;
                    case 11: goto Le7;
                    case 12: goto Le7;
                    case 13: goto Le7;
                    case 14: goto Le7;
                    case 15: goto Le7;
                    case 16: goto Le7;
                    case 17: goto Le7;
                    case 18: goto Le7;
                    case 19: goto L97;
                    case 20: goto Ld2;
                    default: goto L95;
                }
            L95:
                goto L10d
            L97:
                r5.readStrongBinder()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10d
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10d
            La9:
                r5.readString()
                r5.createStringArray()
                goto L10d
            Lb0:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                r5.readStrongBinder()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10d
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10d
            Lce:
                r5.readString()
                goto L10d
            Ld2:
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10d
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10d
            Le7:
                int r4 = r5.readInt()
                if (r4 == 0) goto L10d
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
                goto L10d
            Lf6:
                r5.readString()
                r5.createStringArray()
                r5.readString()
                int r4 = r5.readInt()
                if (r4 == 0) goto L10d
                android.os.Parcelable$Creator r4 = android.os.Bundle.CREATOR
                java.lang.Object r4 = r4.createFromParcel(r5)
                android.os.Bundle r4 = (android.os.Bundle) r4
            L10d:
                java.lang.UnsupportedOperationException r4 = new java.lang.UnsupportedOperationException
                r4.<init>()
                throw r4
        }
    }

    @com.google.android.gms.common.annotation.KeepForSdk
    void getService(@androidx.annotation.NonNull com.google.android.gms.common.internal.IGmsCallbacks r1, @androidx.annotation.Nullable com.google.android.gms.common.internal.GetServiceRequest r2) throws android.os.RemoteException;
}
