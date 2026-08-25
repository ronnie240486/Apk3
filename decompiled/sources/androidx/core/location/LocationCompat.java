package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationCompat {
    public static final java.lang.String EXTRA_BEARING_ACCURACY = "bearingAccuracy";
    public static final java.lang.String EXTRA_IS_MOCK = "mockLocation";
    public static final java.lang.String EXTRA_MSL_ALTITUDE = "androidx.core.location.extra.MSL_ALTITUDE";
    public static final java.lang.String EXTRA_MSL_ALTITUDE_ACCURACY = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY";
    public static final java.lang.String EXTRA_SPEED_ACCURACY = "speedAccuracy";
    public static final java.lang.String EXTRA_VERTICAL_ACCURACY = "verticalAccuracy";

    @androidx.annotation.Nullable
    private static java.lang.reflect.Method sSetIsFromMockProviderMethod;

    @androidx.annotation.RequiresApi(17)
    public static class Api17Impl {
        private Api17Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static long getElapsedRealtimeNanos(android.location.Location r2) {
                long r0 = r2.getElapsedRealtimeNanos()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(18)
    public static class Api18Impl {
        private Api18Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean isMock(android.location.Location r0) {
                boolean r0 = r0.isFromMockProvider()
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(26)
    public static class Api26Impl {
        private Api26Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static float getBearingAccuracyDegrees(android.location.Location r0) {
                float r0 = r0.getBearingAccuracyDegrees()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static float getSpeedAccuracyMetersPerSecond(android.location.Location r0) {
                float r0 = r0.getSpeedAccuracyMetersPerSecond()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static float getVerticalAccuracyMeters(android.location.Location r0) {
                float r0 = r0.getVerticalAccuracyMeters()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasBearingAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasBearingAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasSpeedAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasSpeedAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean hasVerticalAccuracy(android.location.Location r0) {
                boolean r0 = r0.hasVerticalAccuracy()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static void setBearingAccuracyDegrees(android.location.Location r0, float r1) {
                r0.setBearingAccuracyDegrees(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setSpeedAccuracyMetersPerSecond(android.location.Location r0, float r1) {
                r0.setSpeedAccuracyMetersPerSecond(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void setVerticalAccuracyMeters(android.location.Location r0, float r1) {
                r0.setVerticalAccuracyMeters(r1)
                return
        }
    }

    private LocationCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    private static boolean containsExtra(@androidx.annotation.NonNull android.location.Location r0, java.lang.String r1) {
            android.os.Bundle r0 = r0.getExtras()
            if (r0 == 0) goto Le
            boolean r0 = r0.containsKey(r1)
            if (r0 == 0) goto Le
            r0 = 1
            goto Lf
        Le:
            r0 = 0
        Lf:
            return r0
    }

    public static float getBearingAccuracyDegrees(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api26Impl.getBearingAccuracyDegrees(r2)
            return r2
        Lb:
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "bearingAccuracy"
            float r2 = r2.getFloat(r1, r0)
            return r2
    }

    public static long getElapsedRealtimeMillis(@androidx.annotation.NonNull android.location.Location r3) {
            java.util.concurrent.TimeUnit r0 = java.util.concurrent.TimeUnit.NANOSECONDS
            long r1 = androidx.core.location.LocationCompat.Api17Impl.getElapsedRealtimeNanos(r3)
            long r0 = r0.toMillis(r1)
            return r0
    }

    public static long getElapsedRealtimeNanos(@androidx.annotation.NonNull android.location.Location r2) {
            long r0 = androidx.core.location.LocationCompat.Api17Impl.getElapsedRealtimeNanos(r2)
            return r0
    }

    @androidx.annotation.FloatRange(from = 0.0d)
    public static float getMslAltitudeAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2) {
            boolean r0 = hasMslAltitudeAccuracy(r2)
            java.lang.String r1 = "The Mean Sea Level altitude accuracy of the location is not set."
            androidx.core.util.Preconditions.checkState(r0, r1)
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            float r2 = r2.getFloat(r0)
            return r2
    }

    public static double getMslAltitudeMeters(@androidx.annotation.NonNull android.location.Location r2) {
            boolean r0 = hasMslAltitude(r2)
            java.lang.String r1 = "The Mean Sea Level altitude of the location is not set."
            androidx.core.util.Preconditions.checkState(r0, r1)
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            double r0 = r2.getDouble(r0)
            return r0
    }

    private static android.os.Bundle getOrCreateExtras(@androidx.annotation.NonNull android.location.Location r1) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 != 0) goto L12
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            r1.setExtras(r0)
            android.os.Bundle r0 = r1.getExtras()
        L12:
            return r0
    }

    private static java.lang.reflect.Method getSetIsFromMockProviderMethod() throws java.lang.NoSuchMethodException {
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            if (r0 != 0) goto L1a
            java.lang.Class<android.location.Location> r0 = android.location.Location.class
            r1 = 1
            java.lang.Class[] r2 = new java.lang.Class[r1]
            r3 = 0
            java.lang.Class r4 = java.lang.Boolean.TYPE
            r2[r3] = r4
            java.lang.String r3 = "setIsFromMockProvider"
            java.lang.reflect.Method r0 = r0.getDeclaredMethod(r3, r2)
            androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod = r0
            r0.setAccessible(r1)
        L1a:
            java.lang.reflect.Method r0 = androidx.core.location.LocationCompat.sSetIsFromMockProviderMethod
            return r0
    }

    public static float getSpeedAccuracyMetersPerSecond(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api26Impl.getSpeedAccuracyMetersPerSecond(r2)
            return r2
        Lb:
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "speedAccuracy"
            float r2 = r2.getFloat(r1, r0)
            return r2
    }

    public static float getVerticalAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            float r2 = androidx.core.location.LocationCompat.Api26Impl.getVerticalAccuracyMeters(r2)
            return r2
        Lb:
            android.os.Bundle r2 = r2.getExtras()
            r0 = 0
            if (r2 != 0) goto L13
            return r0
        L13:
            java.lang.String r1 = "verticalAccuracy"
            float r2 = r2.getFloat(r1, r0)
            return r2
    }

    public static boolean hasBearingAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api26Impl.hasBearingAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "bearingAccuracy"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasMslAltitude(@androidx.annotation.NonNull android.location.Location r1) {
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            boolean r1 = containsExtra(r1, r0)
            return r1
    }

    public static boolean hasMslAltitudeAccuracy(@androidx.annotation.NonNull android.location.Location r1) {
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            boolean r1 = containsExtra(r1, r0)
            return r1
    }

    public static boolean hasSpeedAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api26Impl.hasSpeedAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "speedAccuracy"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean hasVerticalAccuracy(@androidx.annotation.NonNull android.location.Location r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationCompat.Api26Impl.hasVerticalAccuracy(r2)
            return r2
        Lb:
            java.lang.String r0 = "verticalAccuracy"
            boolean r2 = containsExtra(r2, r0)
            return r2
    }

    public static boolean isMock(@androidx.annotation.NonNull android.location.Location r0) {
            boolean r0 = androidx.core.location.LocationCompat.Api18Impl.isMock(r0)
            return r0
    }

    private static void removeExtra(@androidx.annotation.NonNull android.location.Location r1, java.lang.String r2) {
            android.os.Bundle r0 = r1.getExtras()
            if (r0 == 0) goto L13
            r0.remove(r2)
            boolean r2 = r0.isEmpty()
            if (r2 == 0) goto L13
            r2 = 0
            r1.setExtras(r2)
        L13:
            return
    }

    public static void removeMslAltitude(@androidx.annotation.NonNull android.location.Location r1) {
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            removeExtra(r1, r0)
            return
    }

    public static void removeMslAltitudeAccuracy(@androidx.annotation.NonNull android.location.Location r1) {
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            removeExtra(r1, r0)
            return
    }

    public static void setBearingAccuracyDegrees(@androidx.annotation.NonNull android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setBearingAccuracyDegrees(r2, r3)
            goto L13
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "bearingAccuracy"
            r2.putFloat(r0, r3)
        L13:
            return
    }

    public static void setMock(@androidx.annotation.NonNull android.location.Location r3, boolean r4) {
            java.lang.reflect.Method r0 = getSetIsFromMockProviderMethod()     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r1 = 1
            java.lang.Object[] r1 = new java.lang.Object[r1]     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r2 = 0
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r1[r2] = r4     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            r0.invoke(r3, r1)     // Catch: java.lang.reflect.InvocationTargetException -> L12 java.lang.IllegalAccessException -> L19 java.lang.NoSuchMethodException -> L23
            return
        L12:
            r3 = move-exception
            java.lang.RuntimeException r4 = new java.lang.RuntimeException
            r4.<init>(r3)
            throw r4
        L19:
            r3 = move-exception
            java.lang.IllegalAccessError r4 = new java.lang.IllegalAccessError
            r4.<init>()
            r4.initCause(r3)
            throw r4
        L23:
            r3 = move-exception
            java.lang.NoSuchMethodError r4 = new java.lang.NoSuchMethodError
            r4.<init>()
            r4.initCause(r3)
            throw r4
    }

    public static void setMslAltitudeAccuracyMeters(@androidx.annotation.NonNull android.location.Location r1, @androidx.annotation.FloatRange(from = 0.0d) float r2) {
            android.os.Bundle r1 = getOrCreateExtras(r1)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE_ACCURACY"
            r1.putFloat(r0, r2)
            return
    }

    public static void setMslAltitudeMeters(@androidx.annotation.NonNull android.location.Location r1, double r2) {
            android.os.Bundle r1 = getOrCreateExtras(r1)
            java.lang.String r0 = "androidx.core.location.extra.MSL_ALTITUDE"
            r1.putDouble(r0, r2)
            return
    }

    public static void setSpeedAccuracyMetersPerSecond(@androidx.annotation.NonNull android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setSpeedAccuracyMetersPerSecond(r2, r3)
            goto L14
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "speedAccuracy"
            r2.putFloat(r0, r3)
        L14:
            return
    }

    public static void setVerticalAccuracyMeters(@androidx.annotation.NonNull android.location.Location r2, float r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 26
            if (r0 < r1) goto La
            androidx.core.location.LocationCompat.Api26Impl.setVerticalAccuracyMeters(r2, r3)
            goto L14
        La:
            android.os.Bundle r2 = getOrCreateExtras(r2)
            java.lang.String r0 = "verticalAccuracy"
            r2.putFloat(r0, r3)
        L14:
            return
    }
}
