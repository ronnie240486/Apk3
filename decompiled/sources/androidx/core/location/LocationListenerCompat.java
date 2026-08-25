package androidx.core.location;

/* JADX INFO: loaded from: classes2.dex */
public interface LocationListenerCompat extends android.location.LocationListener {

    /* JADX INFO: renamed from: androidx.core.location.LocationListenerCompat$-CC, reason: invalid class name */
    /* JADX INFO: loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$onFlushComplete(androidx.core.location.LocationListenerCompat r0, int r1) {
                return
        }

        public static void $default$onLocationChanged(androidx.core.location.LocationListenerCompat r3, @androidx.annotation.NonNull java.util.List r4) {
                int r0 = r4.size()
                r1 = 0
            L5:
                if (r1 >= r0) goto L13
                java.lang.Object r2 = r4.get(r1)
                android.location.Location r2 = (android.location.Location) r2
                r3.onLocationChanged(r2)
                int r1 = r1 + 1
                goto L5
            L13:
                return
        }

        public static void $default$onProviderDisabled(androidx.core.location.LocationListenerCompat r0, @androidx.annotation.NonNull java.lang.String r1) {
                return
        }

        public static void $default$onProviderEnabled(androidx.core.location.LocationListenerCompat r0, @androidx.annotation.NonNull java.lang.String r1) {
                return
        }

        public static void $default$onStatusChanged(androidx.core.location.LocationListenerCompat r0, @androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3) {
                return
        }
    }

    @Override // android.location.LocationListener
    void onFlushComplete(int r1);

    @Override // android.location.LocationListener
    void onLocationChanged(@androidx.annotation.NonNull java.util.List<android.location.Location> r1);

    @Override // android.location.LocationListener
    void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r1);

    @Override // android.location.LocationListener
    void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r1);

    @Override // android.location.LocationListener
    void onStatusChanged(@androidx.annotation.NonNull java.lang.String r1, int r2, @androidx.annotation.Nullable android.os.Bundle r3);
}
