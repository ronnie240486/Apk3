package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public abstract class GnssStatusCompat {

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_BEIDOU = 5;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GALILEO = 6;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GLONASS = 3;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_GPS = 1;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_IRNSS = 7;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_QZSS = 4;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_SBAS = 2;

    @android.annotation.SuppressLint({"InlinedApi"})
    public static final int CONSTELLATION_UNKNOWN = 0;

    public static abstract class Callback {
        public Callback() {
                r0 = this;
                r0.<init>()
                return
        }

        public void onFirstFix(@androidx.annotation.IntRange(from = 0) int r1) {
                r0 = this;
                return
        }

        public void onSatelliteStatusChanged(@androidx.annotation.NonNull androidx.core.location.GnssStatusCompat r1) {
                r0 = this;
                return
        }

        public void onStarted() {
                r0 = this;
                return
        }

        public void onStopped() {
                r0 = this;
                return
        }
    }

    @java.lang.annotation.Retention(java.lang.annotation.RetentionPolicy.SOURCE)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public @interface ConstellationType {
    }

    public GnssStatusCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(24)
    public static androidx.core.location.GnssStatusCompat wrap(@androidx.annotation.NonNull android.location.GnssStatus r1) {
            androidx.core.location.GnssStatusWrapper r0 = new androidx.core.location.GnssStatusWrapper
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    @android.annotation.SuppressLint({"ReferencesDeprecated"})
    public static androidx.core.location.GnssStatusCompat wrap(@androidx.annotation.NonNull android.location.GpsStatus r1) {
            androidx.core.location.GpsStatusWrapper r0 = new androidx.core.location.GpsStatusWrapper
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d, to = 360.0d)
    public abstract float getAzimuthDegrees(@androidx.annotation.IntRange(from = 0) int r1);

    @androidx.annotation.FloatRange(from = 0.0d, to = 63.0d)
    public abstract float getBasebandCn0DbHz(@androidx.annotation.IntRange(from = 0) int r1);

    @androidx.annotation.FloatRange(from = 0.0d)
    public abstract float getCarrierFrequencyHz(@androidx.annotation.IntRange(from = 0) int r1);

    @androidx.annotation.FloatRange(from = 0.0d, to = 63.0d)
    public abstract float getCn0DbHz(@androidx.annotation.IntRange(from = 0) int r1);

    public abstract int getConstellationType(@androidx.annotation.IntRange(from = 0) int r1);

    @androidx.annotation.FloatRange(from = -90.0d, to = 90.0d)
    public abstract float getElevationDegrees(@androidx.annotation.IntRange(from = 0) int r1);

    @androidx.annotation.IntRange(from = 0)
    public abstract int getSatelliteCount();

    @androidx.annotation.IntRange(from = 1, to = 200)
    public abstract int getSvid(@androidx.annotation.IntRange(from = 0) int r1);

    public abstract boolean hasAlmanacData(@androidx.annotation.IntRange(from = 0) int r1);

    public abstract boolean hasBasebandCn0DbHz(@androidx.annotation.IntRange(from = 0) int r1);

    public abstract boolean hasCarrierFrequencyHz(@androidx.annotation.IntRange(from = 0) int r1);

    public abstract boolean hasEphemerisData(@androidx.annotation.IntRange(from = 0) int r1);

    public abstract boolean usedInFix(@androidx.annotation.IntRange(from = 0) int r1);
}
