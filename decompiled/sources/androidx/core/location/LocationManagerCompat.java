package androidx.core.location;

/* JADX INFO: loaded from: classes.dex */
public final class LocationManagerCompat {
    private static final long GET_CURRENT_LOCATION_TIMEOUT_MS = 30000;
    private static final long MAX_CURRENT_LOCATION_AGE_MS = 10000;
    private static final long PRE_N_LOOPER_TIMEOUT_S = 5;
    private static java.lang.reflect.Field sContextField;
    private static java.lang.reflect.Method sGnssRequestBuilderBuildMethod;
    private static java.lang.Class<?> sGnssRequestBuilderClass;

    @androidx.annotation.GuardedBy("sLocationListeners")
    public static final java.util.WeakHashMap<androidx.core.location.LocationManagerCompat.LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat.LocationListenerTransport>> sLocationListeners = null;
    private static java.lang.reflect.Method sRegisterGnssMeasurementsCallbackMethod;

    @androidx.annotation.RequiresApi(19)
    public static class Api19Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesLooperMethod;

        private Api19Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean tryRequestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, androidx.core.location.LocationListenerCompat r11, android.os.Looper r12) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L44
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L44
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L44
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L44
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 != 0) goto L30
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r5 = "requestLocationUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L44
                java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L44
                r6[r0] = r7     // Catch: java.lang.Throwable -> L44
                java.lang.Class<android.location.LocationListener> r7 = android.location.LocationListener.class
                r6[r4] = r7     // Catch: java.lang.Throwable -> L44
                java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
                r6[r2] = r7     // Catch: java.lang.Throwable -> L44
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L44
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.Throwable -> L44
                r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L44
            L30:
                android.location.LocationRequest r9 = r10.toLocationRequest(r9)     // Catch: java.lang.Throwable -> L44
                if (r9 == 0) goto L44
                java.lang.reflect.Method r10 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L44
                java.lang.Object[] r1 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L44
                r1[r0] = r9     // Catch: java.lang.Throwable -> L44
                r1[r4] = r11     // Catch: java.lang.Throwable -> L44
                r1[r2] = r12     // Catch: java.lang.Throwable -> L44
                r10.invoke(r8, r1)     // Catch: java.lang.Throwable -> L44
                return r4
            L44:
                return r0
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        public static boolean tryRequestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, androidx.core.location.LocationManagerCompat.LocationListenerTransport r11) {
                r0 = 0
                java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L52
                if (r1 != 0) goto Ld
                java.lang.String r1 = "android.location.LocationRequest"
                java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L52
                androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass = r1     // Catch: java.lang.Throwable -> L52
            Ld:
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L52
                r2 = 2
                r3 = 3
                r4 = 1
                if (r1 != 0) goto L30
                java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
                java.lang.String r5 = "requestLocationUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L52
                java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.Api19Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L52
                r6[r0] = r7     // Catch: java.lang.Throwable -> L52
                java.lang.Class<android.location.LocationListener> r7 = android.location.LocationListener.class
                r6[r4] = r7     // Catch: java.lang.Throwable -> L52
                java.lang.Class<android.os.Looper> r7 = android.os.Looper.class
                r6[r2] = r7     // Catch: java.lang.Throwable -> L52
                java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L52
                androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod = r1     // Catch: java.lang.Throwable -> L52
                r1.setAccessible(r4)     // Catch: java.lang.Throwable -> L52
            L30:
                android.location.LocationRequest r9 = r10.toLocationRequest(r9)     // Catch: java.lang.Throwable -> L52
                if (r9 == 0) goto L52
                java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r10 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L52
                monitor-enter(r10)     // Catch: java.lang.Throwable -> L52
                java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.Api19Impl.sRequestLocationUpdatesLooperMethod     // Catch: java.lang.Throwable -> L4f
                java.lang.Object[] r3 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4f
                r3[r0] = r9     // Catch: java.lang.Throwable -> L4f
                r3[r4] = r11     // Catch: java.lang.Throwable -> L4f
                android.os.Looper r9 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L4f
                r3[r2] = r9     // Catch: java.lang.Throwable -> L4f
                r1.invoke(r8, r3)     // Catch: java.lang.Throwable -> L4f
                androidx.core.location.LocationManagerCompat.registerLocationListenerTransport(r8, r11)     // Catch: java.lang.Throwable -> L4f
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4f
                return r4
            L4f:
                r8 = move-exception
                monitor-exit(r10)     // Catch: java.lang.Throwable -> L4f
                throw r8     // Catch: java.lang.Throwable -> L52 java.lang.Throwable -> L52 java.lang.Throwable -> L52 java.lang.Throwable -> L52 java.lang.Throwable -> L52
            L52:
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(24)
    public static class Api24Impl {
        private Api24Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @androidx.annotation.DoNotInline
        public static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1, @androidx.annotation.NonNull android.os.Handler r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        public static boolean registerGnssStatusCallback(android.location.LocationManager r4, android.os.Handler r5, java.util.concurrent.Executor r6, androidx.core.location.GnssStatusCompat.Callback r7) {
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                androidx.core.util.Preconditions.checkArgument(r2)
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                java.lang.Object r3 = r2.get(r7)     // Catch: java.lang.Throwable -> L2e
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r3     // Catch: java.lang.Throwable -> L2e
                if (r3 != 0) goto L1b
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r3 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport     // Catch: java.lang.Throwable -> L2e
                r3.<init>(r7)     // Catch: java.lang.Throwable -> L2e
                goto L1e
            L1b:
                r3.unregister()     // Catch: java.lang.Throwable -> L2e
            L1e:
                r3.register(r6)     // Catch: java.lang.Throwable -> L2e
                boolean r4 = r4.registerGnssStatusCallback(r3, r5)     // Catch: java.lang.Throwable -> L2e
                if (r4 == 0) goto L2c
                r2.put(r7, r3)     // Catch: java.lang.Throwable -> L2e
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                return r0
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                return r1
            L2e:
                r4 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L2e
                throw r4
        }

        @androidx.annotation.DoNotInline
        public static void unregisterGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1) {
                r0.unregisterGnssMeasurementsCallback(r1)
                return
        }

        @androidx.annotation.DoNotInline
        public static void unregisterGnssStatusCallback(android.location.LocationManager r1, java.lang.Object r2) {
                boolean r0 = r2 instanceof androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport
                if (r0 == 0) goto La
                r0 = r2
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport) r0
                r0.unregister()
            La:
                android.location.GnssStatus$Callback r2 = (android.location.GnssStatus.Callback) r2
                r1.unregisterGnssStatusCallback(r2)
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static java.lang.String getGnssHardwareModelName(android.location.LocationManager r0) {
                java.lang.String r0 = r0.getGnssHardwareModelName()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static int getGnssYearOfHardware(android.location.LocationManager r0) {
                int r0 = r0.getGnssYearOfHardware()
                return r0
        }

        @androidx.annotation.DoNotInline
        public static boolean isLocationEnabled(android.location.LocationManager r0) {
                boolean r0 = r0.isLocationEnabled()
                return r0
        }
    }

    @androidx.annotation.RequiresApi(30)
    public static class Api30Impl {
        private static java.lang.Class<?> sLocationRequestClass;
        private static java.lang.reflect.Method sRequestLocationUpdatesExecutorMethod;

        private Api30Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        public static void getCurrentLocation(android.location.LocationManager r1, @androidx.annotation.NonNull java.lang.String r2, @androidx.annotation.Nullable androidx.core.os.CancellationSignal r3, @androidx.annotation.NonNull java.util.concurrent.Executor r4, @androidx.annotation.NonNull androidx.core.util.Consumer<android.location.Location> r5) {
                if (r3 == 0) goto L9
                java.lang.Object r3 = r3.getCancellationSignalObject()
                android.os.CancellationSignal r3 = (android.os.CancellationSignal) r3
                goto La
            L9:
                r3 = 0
            La:
                java.util.Objects.requireNonNull(r5)
                androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0 r0 = new androidx.core.location.LocationManagerCompat$Api30Impl$$ExternalSyntheticLambda0
                r0.<init>(r5)
                r1.getCurrentLocation(r2, r3, r4, r0)
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        public static boolean registerGnssStatusCallback(android.location.LocationManager r1, android.os.Handler r2, java.util.concurrent.Executor r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
                monitor-enter(r2)
                java.lang.Object r0 = r2.get(r4)     // Catch: java.lang.Throwable -> L1f
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r0 = (androidx.core.location.LocationManagerCompat.GnssStatusTransport) r0     // Catch: java.lang.Throwable -> L1f
                if (r0 != 0) goto L10
                androidx.core.location.LocationManagerCompat$GnssStatusTransport r0 = new androidx.core.location.LocationManagerCompat$GnssStatusTransport     // Catch: java.lang.Throwable -> L1f
                r0.<init>(r4)     // Catch: java.lang.Throwable -> L1f
            L10:
                boolean r1 = r1.registerGnssStatusCallback(r3, r0)     // Catch: java.lang.Throwable -> L1f
                if (r1 == 0) goto L1c
                r2.put(r4, r0)     // Catch: java.lang.Throwable -> L1f
                r1 = 1
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
                return r1
            L1c:
                r1 = 0
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
                return r1
            L1f:
                r1 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L1f
                throw r1
        }

        @androidx.annotation.DoNotInline
        public static boolean tryRequestLocationUpdates(android.location.LocationManager r8, java.lang.String r9, androidx.core.location.LocationRequestCompat r10, java.util.concurrent.Executor r11, androidx.core.location.LocationListenerCompat r12) {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 0
                r2 = 30
                if (r0 < r2) goto L4a
                java.lang.Class<?> r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L4a
                if (r0 != 0) goto L13
                java.lang.String r0 = "android.location.LocationRequest"
                java.lang.Class r0 = java.lang.Class.forName(r0)     // Catch: java.lang.Throwable -> L4a
                androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass = r0     // Catch: java.lang.Throwable -> L4a
            L13:
                java.lang.reflect.Method r0 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.Throwable -> L4a
                r2 = 2
                r3 = 3
                r4 = 1
                if (r0 != 0) goto L36
                java.lang.Class<android.location.LocationManager> r0 = android.location.LocationManager.class
                java.lang.String r5 = "requestLocationUpdates"
                java.lang.Class[] r6 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L4a
                java.lang.Class<?> r7 = androidx.core.location.LocationManagerCompat.Api30Impl.sLocationRequestClass     // Catch: java.lang.Throwable -> L4a
                r6[r1] = r7     // Catch: java.lang.Throwable -> L4a
                java.lang.Class<java.util.concurrent.Executor> r7 = java.util.concurrent.Executor.class
                r6[r4] = r7     // Catch: java.lang.Throwable -> L4a
                java.lang.Class<android.location.LocationListener> r7 = android.location.LocationListener.class
                r6[r2] = r7     // Catch: java.lang.Throwable -> L4a
                java.lang.reflect.Method r0 = r0.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L4a
                androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod = r0     // Catch: java.lang.Throwable -> L4a
                r0.setAccessible(r4)     // Catch: java.lang.Throwable -> L4a
            L36:
                android.location.LocationRequest r9 = r10.toLocationRequest(r9)     // Catch: java.lang.Throwable -> L4a
                if (r9 == 0) goto L4a
                java.lang.reflect.Method r10 = androidx.core.location.LocationManagerCompat.Api30Impl.sRequestLocationUpdatesExecutorMethod     // Catch: java.lang.Throwable -> L4a
                java.lang.Object[] r0 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L4a
                r0[r1] = r9     // Catch: java.lang.Throwable -> L4a
                r0[r4] = r11     // Catch: java.lang.Throwable -> L4a
                r0[r2] = r12     // Catch: java.lang.Throwable -> L4a
                r10.invoke(r8, r0)     // Catch: java.lang.Throwable -> L4a
                return r4
            L4a:
                return r1
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(31)
    public static class Api31Impl {
        private Api31Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static boolean hasProvider(android.location.LocationManager r0, @androidx.annotation.NonNull java.lang.String r1) {
                boolean r0 = r0.hasProvider(r1)
                return r0
        }

        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        @androidx.annotation.DoNotInline
        public static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull java.util.concurrent.Executor r1, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r2) {
                boolean r0 = r0.registerGnssMeasurementsCallback(r1, r2)
                return r0
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        @androidx.annotation.DoNotInline
        public static void requestLocationUpdates(android.location.LocationManager r0, @androidx.annotation.NonNull java.lang.String r1, @androidx.annotation.NonNull android.location.LocationRequest r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.location.LocationListener r4) {
                r0.requestLocationUpdates(r1, r2, r3, r4)
                return
        }
    }

    public static final class CancellableLocationListener implements android.location.LocationListener {
        private androidx.core.util.Consumer<android.location.Location> mConsumer;
        private final java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;
        private final android.os.Handler mTimeoutHandler;

        @androidx.annotation.Nullable
        public androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0 mTimeoutRunnable;

        @androidx.annotation.GuardedBy("this")
        private boolean mTriggered;

        public static /* synthetic */ void $r8$lambda$YCtILUhe93mA2Pmh3tYj1h0qzZs(androidx.core.util.Consumer r0, android.location.Location r1) {
                lambda$onLocationChanged$1(r0, r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$t_KfxTHtM_iJ8uJYVqEknYPfeGQ(androidx.core.location.LocationManagerCompat.CancellableLocationListener r0) {
                r0.lambda$startTimeout$0()
                return
        }

        public CancellableLocationListener(android.location.LocationManager r1, java.util.concurrent.Executor r2, androidx.core.util.Consumer<android.location.Location> r3) {
                r0 = this;
                r0.<init>()
                r0.mLocationManager = r1
                r0.mExecutor = r2
                android.os.Handler r1 = new android.os.Handler
                android.os.Looper r2 = android.os.Looper.getMainLooper()
                r1.<init>(r2)
                r0.mTimeoutHandler = r1
                r0.mConsumer = r3
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        private void cleanup() {
                r3 = this;
                r0 = 0
                r3.mConsumer = r0
                android.location.LocationManager r1 = r3.mLocationManager
                r1.removeUpdates(r3)
                androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0 r1 = r3.mTimeoutRunnable
                if (r1 == 0) goto L13
                android.os.Handler r2 = r3.mTimeoutHandler
                r2.removeCallbacks(r1)
                r3.mTimeoutRunnable = r0
            L13:
                return
        }

        private static /* synthetic */ void lambda$onLocationChanged$1(androidx.core.util.Consumer r0, android.location.Location r1) {
                r0.accept(r1)
                return
        }

        private /* synthetic */ void lambda$startTimeout$0() {
                r1 = this;
                r0 = 0
                r1.mTimeoutRunnable = r0
                r1.onLocationChanged(r0)
                return
        }

        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void cancel() {
                r1 = this;
                monitor-enter(r1)
                boolean r0 = r1.mTriggered     // Catch: java.lang.Throwable -> Lf
                if (r0 == 0) goto L7
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                return
            L7:
                r0 = 1
                r1.mTriggered = r0     // Catch: java.lang.Throwable -> Lf
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                r1.cleanup()
                return
            Lf:
                r0 = move-exception
                monitor-exit(r1)     // Catch: java.lang.Throwable -> Lf
                throw r0
        }

        @Override // android.location.LocationListener
        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onLocationChanged(@androidx.annotation.Nullable android.location.Location r5) {
                r4 = this;
                monitor-enter(r4)
                boolean r0 = r4.mTriggered     // Catch: java.lang.Throwable -> L1b
                if (r0 == 0) goto L7
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
                return
            L7:
                r0 = 1
                r4.mTriggered = r0     // Catch: java.lang.Throwable -> L1b
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
                androidx.core.util.Consumer<android.location.Location> r1 = r4.mConsumer
                java.util.concurrent.Executor r2 = r4.mExecutor
                androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1 r3 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1
                r3.<init>(r1, r5, r0)
                r2.execute(r3)
                r4.cleanup()
                return
            L1b:
                r5 = move-exception
                monitor-exit(r4)     // Catch: java.lang.Throwable -> L1b
                throw r5
        }

        @Override // android.location.LocationListener
        @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
        public void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                r1 = 0
                r0.onLocationChanged(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r1) {
                r0 = this;
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r1, int r2, android.os.Bundle r3) {
                r0 = this;
                return
        }

        @android.annotation.SuppressLint({"MissingPermission"})
        public void startTimeout(long r3) {
                r2 = this;
                monitor-enter(r2)
                boolean r0 = r2.mTriggered     // Catch: java.lang.Throwable -> L15
                if (r0 == 0) goto L7
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                return
            L7:
                androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0 r0 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener$$ExternalSyntheticLambda0     // Catch: java.lang.Throwable -> L15
                r0.<init>(r2)     // Catch: java.lang.Throwable -> L15
                r2.mTimeoutRunnable = r0     // Catch: java.lang.Throwable -> L15
                android.os.Handler r1 = r2.mTimeoutHandler     // Catch: java.lang.Throwable -> L15
                r1.postDelayed(r0, r3)     // Catch: java.lang.Throwable -> L15
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                return
            L15:
                r3 = move-exception
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L15
                throw r3
        }
    }

    public static class GnssListenersHolder {

        @androidx.annotation.GuardedBy("sGnssStatusListeners")
        public static final androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> sGnssStatusListeners = null;

        static {
                androidx.collection.SimpleArrayMap r0 = new androidx.collection.SimpleArrayMap
                r0.<init>()
                androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners = r0
                return
        }

        private GnssListenersHolder() {
                r0 = this;
                r0.<init>()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    @androidx.annotation.RequiresApi(30)
    public static class GnssStatusTransport extends android.location.GnssStatus.Callback {
        public final androidx.core.location.GnssStatusCompat.Callback mCallback;

        public GnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onFirstFix(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r2) {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                androidx.core.location.GnssStatusCompat r2 = androidx.core.location.GnssStatusCompat.wrap(r2)
                r0.onSatelliteStatusChanged(r2)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStarted()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r1 = this;
                androidx.core.location.GnssStatusCompat$Callback r0 = r1.mCallback
                r0.onStopped()
                return
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class GpsStatusTransport implements android.location.GpsStatus.Listener {
        public final androidx.core.location.GnssStatusCompat.Callback mCallback;

        @androidx.annotation.Nullable
        public volatile java.util.concurrent.Executor mExecutor;
        private final android.location.LocationManager mLocationManager;

        /* JADX INFO: renamed from: $r8$lambda$T0auuLwz-EMM99veZUbxskDo10s, reason: not valid java name */
        public static /* synthetic */ void m28$r8$lambda$T0auuLwzEMM99veZUbxskDo10s(androidx.core.location.LocationManagerCompat.GpsStatusTransport r0, java.util.concurrent.Executor r1, int r2) {
                r0.lambda$onGpsStatusChanged$2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$V4NDbKd22V64-RxjVMVd419nswo, reason: not valid java name */
        public static /* synthetic */ void m29$r8$lambda$V4NDbKd22V64RxjVMVd419nswo(androidx.core.location.LocationManagerCompat.GpsStatusTransport r0, java.util.concurrent.Executor r1, androidx.core.location.GnssStatusCompat r2) {
                r0.lambda$onGpsStatusChanged$3(r1, r2)
                return
        }

        public static /* synthetic */ void $r8$lambda$YdTHlyzRR62cUonlTLG1CDPrghk(androidx.core.location.LocationManagerCompat.GpsStatusTransport r0, java.util.concurrent.Executor r1) {
                r0.lambda$onGpsStatusChanged$0(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$o4is_vEFQnCFL3phcwhrVAcNx6o(androidx.core.location.LocationManagerCompat.GpsStatusTransport r0, java.util.concurrent.Executor r1) {
                r0.lambda$onGpsStatusChanged$1(r1)
                return
        }

        public GpsStatusTransport(android.location.LocationManager r3, androidx.core.location.GnssStatusCompat.Callback r4) {
                r2 = this;
                r2.<init>()
                if (r4 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mLocationManager = r3
                r2.mCallback = r4
                return
        }

        private /* synthetic */ void lambda$onGpsStatusChanged$0(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStarted()
                return
        }

        private /* synthetic */ void lambda$onGpsStatusChanged$1(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStopped()
                return
        }

        private /* synthetic */ void lambda$onGpsStatusChanged$2(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onFirstFix(r3)
                return
        }

        private /* synthetic */ void lambda$onGpsStatusChanged$3(java.util.concurrent.Executor r2, androidx.core.location.GnssStatusCompat r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onSatelliteStatusChanged(r3)
                return
        }

        @Override // android.location.GpsStatus.Listener
        @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
        public void onGpsStatusChanged(int r5) {
                r4 = this;
                java.util.concurrent.Executor r0 = r4.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                r1 = 1
                r2 = 0
                if (r5 == r1) goto L47
                r3 = 2
                if (r5 == r3) goto L3e
                r1 = 3
                r3 = 0
                if (r5 == r1) goto L29
                r1 = 4
                if (r5 == r1) goto L14
                goto L4f
            L14:
                android.location.LocationManager r5 = r4.mLocationManager
                android.location.GpsStatus r5 = r5.getGpsStatus(r3)
                if (r5 == 0) goto L4f
                androidx.core.location.GnssStatusCompat r5 = androidx.core.location.GnssStatusCompat.wrap(r5)
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                r1.<init>(r4, r0, r5, r2)
                r0.execute(r1)
                goto L4f
            L29:
                android.location.LocationManager r5 = r4.mLocationManager
                android.location.GpsStatus r5 = r5.getGpsStatus(r3)
                if (r5 == 0) goto L4f
                int r5 = r5.getTimeToFirstFix()
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                r1.<init>(r4, r0, r5, r2)
                r0.execute(r1)
                goto L4f
            L3e:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0 r5 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                r5.<init>(r4, r0, r1)
                r0.execute(r5)
                goto L4f
            L47:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0 r5 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda0
                r5.<init>(r4, r0, r2)
                r0.execute(r5)
            L4f:
                return
        }

        public void register(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                androidx.core.util.Preconditions.checkState(r0)
                r1.mExecutor = r2
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static final class InlineHandlerExecutor implements java.util.concurrent.Executor {
        private final android.os.Handler mHandler;

        public InlineHandlerExecutor(@androidx.annotation.NonNull android.os.Handler r1) {
                r0 = this;
                r0.<init>()
                java.lang.Object r1 = androidx.core.util.Preconditions.checkNotNull(r1)
                android.os.Handler r1 = (android.os.Handler) r1
                r0.mHandler = r1
                return
        }

        @Override // java.util.concurrent.Executor
        public void execute(@androidx.annotation.NonNull java.lang.Runnable r3) {
                r2 = this;
                android.os.Looper r0 = android.os.Looper.myLooper()
                android.os.Handler r1 = r2.mHandler
                android.os.Looper r1 = r1.getLooper()
                if (r0 != r1) goto L10
                r3.run()
                goto L1e
            L10:
                android.os.Handler r0 = r2.mHandler
                java.lang.Object r3 = androidx.core.util.Preconditions.checkNotNull(r3)
                java.lang.Runnable r3 = (java.lang.Runnable) r3
                boolean r3 = r0.post(r3)
                if (r3 == 0) goto L1f
            L1e:
                return
            L1f:
                java.util.concurrent.RejectedExecutionException r3 = new java.util.concurrent.RejectedExecutionException
                java.lang.StringBuilder r0 = new java.lang.StringBuilder
                r0.<init>()
                android.os.Handler r1 = r2.mHandler
                r0.append(r1)
                java.lang.String r1 = " is shutting down"
                r0.append(r1)
                java.lang.String r0 = r0.toString()
                r3.<init>(r0)
                throw r3
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LocationListenerKey {
        public final androidx.core.location.LocationListenerCompat mListener;
        public final java.lang.String mProvider;

        public LocationListenerKey(java.lang.String r2, androidx.core.location.LocationListenerCompat r3) {
                r1 = this;
                r1.<init>()
                java.lang.String r0 = "invalid null provider"
                java.lang.Object r2 = androidx.core.util.ObjectsCompat.requireNonNull(r2, r0)
                java.lang.String r2 = (java.lang.String) r2
                r1.mProvider = r2
                java.lang.String r2 = "invalid null listener"
                java.lang.Object r2 = androidx.core.util.ObjectsCompat.requireNonNull(r3, r2)
                androidx.core.location.LocationListenerCompat r2 = (androidx.core.location.LocationListenerCompat) r2
                r1.mListener = r2
                return
        }

        public boolean equals(java.lang.Object r4) {
                r3 = this;
                boolean r0 = r4 instanceof androidx.core.location.LocationManagerCompat.LocationListenerKey
                r1 = 0
                if (r0 != 0) goto L6
                return r1
            L6:
                androidx.core.location.LocationManagerCompat$LocationListenerKey r4 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r4
                java.lang.String r0 = r3.mProvider
                java.lang.String r2 = r4.mProvider
                boolean r0 = r0.equals(r2)
                if (r0 == 0) goto L1d
                androidx.core.location.LocationListenerCompat r0 = r3.mListener
                androidx.core.location.LocationListenerCompat r4 = r4.mListener
                boolean r4 = r0.equals(r4)
                if (r4 == 0) goto L1d
                r1 = 1
            L1d:
                return r1
        }

        public int hashCode() {
                r3 = this;
                r0 = 2
                java.lang.Object[] r0 = new java.lang.Object[r0]
                java.lang.String r1 = r3.mProvider
                r2 = 0
                r0[r2] = r1
                androidx.core.location.LocationListenerCompat r1 = r3.mListener
                r2 = 1
                r0[r2] = r1
                int r0 = androidx.core.util.ObjectsCompat.hash(r0)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class LocationListenerTransport implements android.location.LocationListener {
        public final java.util.concurrent.Executor mExecutor;

        @androidx.annotation.Nullable
        public volatile androidx.core.location.LocationManagerCompat.LocationListenerKey mKey;

        /* JADX INFO: renamed from: $r8$lambda$B1gsSTxy0V0GwE3O1urJcFM1N-w, reason: not valid java name */
        public static /* synthetic */ void m30$r8$lambda$B1gsSTxy0V0GwE3O1urJcFM1Nw(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.lang.String r1) {
                r0.lambda$onProviderEnabled$4(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$DPle4JPT7thJs_1Mhy2-Ne8V4No, reason: not valid java name */
        public static /* synthetic */ void m31$r8$lambda$DPle4JPT7thJs_1Mhy2Ne8V4No(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.lang.String r1, int r2, android.os.Bundle r3) {
                r0.lambda$onStatusChanged$3(r1, r2, r3)
                return
        }

        public static /* synthetic */ void $r8$lambda$MhoeUnGkDr3ot8_83pxTiAeIweg(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.util.List r1) {
                r0.lambda$onLocationChanged$1(r1)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$e6SckAV-OXLz5sqdYaQciymznw4, reason: not valid java name */
        public static /* synthetic */ void m32$r8$lambda$e6SckAVOXLz5sqdYaQciymznw4(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, int r1) {
                r0.lambda$onFlushComplete$2(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$lsVZkfjeu_iNJq_Fu3P9SKpwa6w(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, java.lang.String r1) {
                r0.lambda$onProviderDisabled$5(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$nQA1ES9Z0HoQZ4k2kiq64G5J1Hw(androidx.core.location.LocationManagerCompat.LocationListenerTransport r0, android.location.Location r1) {
                r0.lambda$onLocationChanged$0(r1)
                return
        }

        public LocationListenerTransport(@androidx.annotation.Nullable androidx.core.location.LocationManagerCompat.LocationListenerKey r1, java.util.concurrent.Executor r2) {
                r0 = this;
                r0.<init>()
                r0.mKey = r1
                r0.mExecutor = r2
                return
        }

        private /* synthetic */ void lambda$onFlushComplete$2(int r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onFlushComplete(r2)
                return
        }

        private /* synthetic */ void lambda$onLocationChanged$0(android.location.Location r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onLocationChanged(r2)
                return
        }

        private /* synthetic */ void lambda$onLocationChanged$1(java.util.List r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onLocationChanged(r2)
                return
        }

        private /* synthetic */ void lambda$onProviderDisabled$5(java.lang.String r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onProviderDisabled(r2)
                return
        }

        private /* synthetic */ void lambda$onProviderEnabled$4(java.lang.String r2) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onProviderEnabled(r2)
                return
        }

        private /* synthetic */ void lambda$onStatusChanged$3(java.lang.String r2, int r3, android.os.Bundle r4) {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationListenerCompat r0 = r0.mListener
                r0.onStatusChanged(r2, r3, r4)
                return
        }

        public androidx.core.location.LocationManagerCompat.LocationListenerKey getKey() {
                r1 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r1.mKey
                java.lang.Object r0 = androidx.core.util.ObjectsCompat.requireNonNull(r0)
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r0
                return r0
        }

        @Override // android.location.LocationListener
        public void onFlushComplete(int r3) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda2
                r1.<init>(r2, r3)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.NonNull android.location.Location r4) {
                r3 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r3.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r3.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r4, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(@androidx.annotation.NonNull java.util.List<android.location.Location> r4) {
                r3 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r3.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r3.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r3.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r3.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                r2 = 1
                r1.<init>(r3, r4, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(@androidx.annotation.NonNull java.lang.String r4) {
                r3 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r3.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r3.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda1
                r2 = 0
                r1.<init>(r3, r4, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(java.lang.String r3, int r4, android.os.Bundle r5) {
                r2 = this;
                androidx.core.location.LocationManagerCompat$LocationListenerKey r0 = r2.mKey
                if (r0 != 0) goto L5
                return
            L5:
                java.util.concurrent.Executor r0 = r2.mExecutor
                androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3 r1 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport$$ExternalSyntheticLambda3
                r1.<init>(r2, r3, r4, r5)
                r0.execute(r1)
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mKey = r0
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    @androidx.annotation.RequiresApi(24)
    public static class PreRGnssStatusTransport extends android.location.GnssStatus.Callback {
        public final androidx.core.location.GnssStatusCompat.Callback mCallback;

        @androidx.annotation.Nullable
        public volatile java.util.concurrent.Executor mExecutor;

        public static /* synthetic */ void $r8$lambda$EV3ALfMBDotS9TFPL4C05K2QFGM(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r0, java.util.concurrent.Executor r1) {
                r0.lambda$onStopped$1(r1)
                return
        }

        public static /* synthetic */ void $r8$lambda$M98hBYbLkP_lHaBu4FbOg7TdZV0(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r0, java.util.concurrent.Executor r1, android.location.GnssStatus r2) {
                r0.lambda$onSatelliteStatusChanged$3(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$UrmG531cBaBG_MqEWQ-130Gx_xM, reason: not valid java name */
        public static /* synthetic */ void m33$r8$lambda$UrmG531cBaBG_MqEWQ130Gx_xM(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r0, java.util.concurrent.Executor r1, int r2) {
                r0.lambda$onFirstFix$2(r1, r2)
                return
        }

        /* JADX INFO: renamed from: $r8$lambda$W1WiagGzlSlFoo8c3Qd6ur-jz2M, reason: not valid java name */
        public static /* synthetic */ void m34$r8$lambda$W1WiagGzlSlFoo8c3Qd6urjz2M(androidx.core.location.LocationManagerCompat.PreRGnssStatusTransport r0, java.util.concurrent.Executor r1) {
                r0.lambda$onStarted$0(r1)
                return
        }

        public PreRGnssStatusTransport(androidx.core.location.GnssStatusCompat.Callback r3) {
                r2 = this;
                r2.<init>()
                if (r3 == 0) goto L7
                r0 = 1
                goto L8
            L7:
                r0 = 0
            L8:
                java.lang.String r1 = "invalid null callback"
                androidx.core.util.Preconditions.checkArgument(r0, r1)
                r2.mCallback = r3
                return
        }

        private /* synthetic */ void lambda$onFirstFix$2(java.util.concurrent.Executor r2, int r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onFirstFix(r3)
                return
        }

        private /* synthetic */ void lambda$onSatelliteStatusChanged$3(java.util.concurrent.Executor r2, android.location.GnssStatus r3) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                androidx.core.location.GnssStatusCompat r3 = androidx.core.location.GnssStatusCompat.wrap(r3)
                r2.onSatelliteStatusChanged(r3)
                return
        }

        private /* synthetic */ void lambda$onStarted$0(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStarted()
                return
        }

        private /* synthetic */ void lambda$onStopped$1(java.util.concurrent.Executor r2) {
                r1 = this;
                java.util.concurrent.Executor r0 = r1.mExecutor
                if (r0 == r2) goto L5
                return
            L5:
                androidx.core.location.GnssStatusCompat$Callback r2 = r1.mCallback
                r2.onStopped()
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onFirstFix(int r4) {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda2
                r2 = 1
                r1.<init>(r3, r0, r4, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onSatelliteStatusChanged(android.location.GnssStatus r4) {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1 r1 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport$$ExternalSyntheticLambda1
                r2 = 1
                r1.<init>(r3, r0, r4, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStarted() {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                r2 = 0
                r1.<init>(r3, r0, r2)
                r0.execute(r1)
                return
        }

        @Override // android.location.GnssStatus.Callback
        public void onStopped() {
                r3 = this;
                java.util.concurrent.Executor r0 = r3.mExecutor
                if (r0 != 0) goto L5
                return
            L5:
                androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0 r1 = new androidx.core.location.LocationManagerCompat$PreRGnssStatusTransport$$ExternalSyntheticLambda0
                r2 = 1
                r1.<init>(r3, r0, r2)
                r0.execute(r1)
                return
        }

        public void register(java.util.concurrent.Executor r5) {
                r4 = this;
                r0 = 1
                r1 = 0
                if (r5 == 0) goto L6
                r2 = 1
                goto L7
            L6:
                r2 = 0
            L7:
                java.lang.String r3 = "invalid null executor"
                androidx.core.util.Preconditions.checkArgument(r2, r3)
                java.util.concurrent.Executor r2 = r4.mExecutor
                if (r2 != 0) goto L11
                goto L12
            L11:
                r0 = 0
            L12:
                androidx.core.util.Preconditions.checkState(r0)
                r4.mExecutor = r5
                return
        }

        public void unregister() {
                r1 = this;
                r0 = 0
                r1.mExecutor = r0
                return
        }
    }

    public static /* synthetic */ void $r8$lambda$BuDFX8p4cZynZHSiCJ1nwl98OSc(androidx.core.util.Consumer r0, android.location.Location r1) {
            lambda$getCurrentLocation$0(r0, r1)
            return
    }

    public static /* synthetic */ java.lang.Boolean $r8$lambda$JLIcm4BkQpukCiUbhX4BKZUICt4(android.location.LocationManager r0, androidx.core.location.LocationManagerCompat.GpsStatusTransport r1) {
            java.lang.Boolean r0 = lambda$registerGnssStatusCallback$1(r0, r1)
            return r0
    }

    static {
            java.util.WeakHashMap r0 = new java.util.WeakHashMap
            r0.<init>()
            androidx.core.location.LocationManagerCompat.sLocationListeners = r0
            return
    }

    private LocationManagerCompat() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void getCurrentLocation(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.Nullable androidx.core.os.CancellationSignal r10, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.NonNull androidx.core.util.Consumer<android.location.Location> r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto La
            androidx.core.location.LocationManagerCompat.Api30Impl.getCurrentLocation(r8, r9, r10, r11, r12)
            return
        La:
            if (r10 == 0) goto Lf
            r10.throwIfCanceled()
        Lf:
            android.location.Location r0 = r8.getLastKnownLocation(r9)
            if (r0 == 0) goto L2e
            long r1 = android.os.SystemClock.elapsedRealtime()
            long r3 = androidx.core.location.LocationCompat.getElapsedRealtimeMillis(r0)
            long r1 = r1 - r3
            r3 = 10000(0x2710, double:4.9407E-320)
            int r5 = (r1 > r3 ? 1 : (r1 == r3 ? 0 : -1))
            if (r5 >= 0) goto L2e
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1 r8 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda1
            r9 = 0
            r8.<init>(r12, r0, r9)
            r11.execute(r8)
            return
        L2e:
            androidx.core.location.LocationManagerCompat$CancellableLocationListener r0 = new androidx.core.location.LocationManagerCompat$CancellableLocationListener
            r0.<init>(r8, r11, r12)
            r3 = 0
            r5 = 0
            android.os.Looper r7 = android.os.Looper.getMainLooper()
            r1 = r8
            r2 = r9
            r6 = r0
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            if (r10 == 0) goto L4a
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0 r8 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda0
            r8.<init>(r0)
            r10.setOnCancelListener(r8)
        L4a:
            r8 = 30000(0x7530, double:1.4822E-319)
            r0.startTimeout(r8)
            return
    }

    @androidx.annotation.Nullable
    public static java.lang.String getGnssHardwareModelName(@androidx.annotation.NonNull android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            java.lang.String r2 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssHardwareModelName(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static int getGnssYearOfHardware(@androidx.annotation.NonNull android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            int r2 = androidx.core.location.LocationManagerCompat.Api28Impl.getGnssYearOfHardware(r2)
            return r2
        Lb:
            r2 = 0
            return r2
    }

    public static boolean hasProvider(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull java.lang.String r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api31Impl.hasProvider(r2, r3)
            return r2
        Lb:
            java.util.List r0 = r2.getAllProviders()
            boolean r0 = r0.contains(r3)
            r1 = 1
            if (r0 == 0) goto L17
            return r1
        L17:
            r0 = 0
            android.location.LocationProvider r2 = r2.getProvider(r3)     // Catch: java.lang.SecurityException -> L21
            if (r2 == 0) goto L1f
            goto L20
        L1f:
            r1 = 0
        L20:
            return r1
        L21:
            return r0
    }

    public static boolean isLocationEnabled(@androidx.annotation.NonNull android.location.LocationManager r2) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api28Impl.isLocationEnabled(r2)
            return r2
        Lb:
            java.lang.String r0 = "network"
            boolean r0 = r2.isProviderEnabled(r0)
            if (r0 != 0) goto L1e
            java.lang.String r0 = "gps"
            boolean r2 = r2.isProviderEnabled(r0)
            if (r2 == 0) goto L1c
            goto L1e
        L1c:
            r2 = 0
            goto L1f
        L1e:
            r2 = 1
        L1f:
            return r2
    }

    private static /* synthetic */ void lambda$getCurrentLocation$0(androidx.core.util.Consumer r0, android.location.Location r1) {
            r0.accept(r1)
            return
    }

    private static /* synthetic */ java.lang.Boolean lambda$registerGnssStatusCallback$1(android.location.LocationManager r0, androidx.core.location.LocationManagerCompat.GpsStatusTransport r1) throws java.lang.Exception {
            boolean r0 = r0.addGpsStatusListener(r1)
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            return r0
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.RequiresApi(24)
    public static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r3, @androidx.annotation.NonNull android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 == r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r2
        Lb:
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssMeasurementsCallbackOnR(r2, r4, r3)
            return r2
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    @androidx.annotation.RequiresApi(30)
    public static boolean registerGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 <= r1) goto Lb
            boolean r2 = androidx.core.location.LocationManagerCompat.Api31Impl.registerGnssMeasurementsCallback(r2, r3, r4)
            return r2
        Lb:
            boolean r2 = registerGnssMeasurementsCallbackOnR(r2, r3, r4)
            return r2
    }

    @androidx.annotation.RequiresApi(30)
    private static boolean registerGnssMeasurementsCallbackOnR(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.util.concurrent.Executor r9, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r10) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 != r1) goto L7d
            r0 = 0
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L7c
            if (r1 != 0) goto L13
            java.lang.String r1 = "android.location.GnssRequest$Builder"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L7c
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass = r1     // Catch: java.lang.Throwable -> L7c
        L13:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.Throwable -> L7c
            r2 = 1
            if (r1 != 0) goto L27
            java.lang.Class<?> r1 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L7c
            java.lang.String r3 = "build"
            java.lang.Class[] r4 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r3, r4)     // Catch: java.lang.Throwable -> L7c
            androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod = r1     // Catch: java.lang.Throwable -> L7c
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L7c
        L27:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.Throwable -> L7c
            r3 = 2
            r4 = 3
            if (r1 != 0) goto L4d
            java.lang.Class<android.location.LocationManager> r1 = android.location.LocationManager.class
            java.lang.String r5 = "registerGnssMeasurementsCallback"
            java.lang.Class[] r6 = new java.lang.Class[r4]     // Catch: java.lang.Throwable -> L7c
            java.lang.String r7 = "android.location.GnssRequest"
            java.lang.Class r7 = java.lang.Class.forName(r7)     // Catch: java.lang.Throwable -> L7c
            r6[r0] = r7     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<java.util.concurrent.Executor> r7 = java.util.concurrent.Executor.class
            r6[r2] = r7     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<android.location.GnssMeasurementsEvent$Callback> r7 = android.location.GnssMeasurementsEvent.Callback.class
            r6[r3] = r7     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Method r1 = r1.getDeclaredMethod(r5, r6)     // Catch: java.lang.Throwable -> L7c
            androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod = r1     // Catch: java.lang.Throwable -> L7c
            r1.setAccessible(r2)     // Catch: java.lang.Throwable -> L7c
        L4d:
            java.lang.reflect.Method r1 = androidx.core.location.LocationManagerCompat.sRegisterGnssMeasurementsCallbackMethod     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r4 = new java.lang.Object[r4]     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Method r5 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderBuildMethod     // Catch: java.lang.Throwable -> L7c
            java.lang.Class<?> r6 = androidx.core.location.LocationManagerCompat.sGnssRequestBuilderClass     // Catch: java.lang.Throwable -> L7c
            java.lang.Class[] r7 = new java.lang.Class[r0]     // Catch: java.lang.Throwable -> L7c
            java.lang.reflect.Constructor r6 = r6.getDeclaredConstructor(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r6 = r6.newInstance(r7)     // Catch: java.lang.Throwable -> L7c
            java.lang.Object[] r7 = new java.lang.Object[r0]     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r5 = r5.invoke(r6, r7)     // Catch: java.lang.Throwable -> L7c
            r4[r0] = r5     // Catch: java.lang.Throwable -> L7c
            r4[r2] = r9     // Catch: java.lang.Throwable -> L7c
            r4[r3] = r10     // Catch: java.lang.Throwable -> L7c
            java.lang.Object r8 = r1.invoke(r8, r4)     // Catch: java.lang.Throwable -> L7c
            if (r8 == 0) goto L7c
            java.lang.Boolean r8 = (java.lang.Boolean) r8     // Catch: java.lang.Throwable -> L7c
            boolean r8 = r8.booleanValue()     // Catch: java.lang.Throwable -> L7c
            if (r8 == 0) goto L7c
            r0 = 1
        L7c:
            return r0
        L7d:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            r8.<init>()
            throw r8
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    private static boolean registerGnssStatusCallback(android.location.LocationManager r9, android.os.Handler r10, java.util.concurrent.Executor r11, androidx.core.location.GnssStatusCompat.Callback r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lb
            boolean r9 = androidx.core.location.LocationManagerCompat.Api30Impl.registerGnssStatusCallback(r9, r10, r11, r12)
            return r9
        Lb:
            r1 = 24
            if (r0 < r1) goto L14
            boolean r9 = androidx.core.location.LocationManagerCompat.Api24Impl.registerGnssStatusCallback(r9, r10, r11, r12)
            return r9
        L14:
            r0 = 1
            r1 = 0
            if (r10 == 0) goto L1a
            r2 = 1
            goto L1b
        L1a:
            r2 = 0
        L1b:
            androidx.core.util.Preconditions.checkArgument(r2)
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r2 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r2)
            java.lang.Object r3 = r2.get(r12)     // Catch: java.lang.Throwable -> L103
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r3     // Catch: java.lang.Throwable -> L103
            if (r3 != 0) goto L2f
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = new androidx.core.location.LocationManagerCompat$GpsStatusTransport     // Catch: java.lang.Throwable -> L103
            r3.<init>(r9, r12)     // Catch: java.lang.Throwable -> L103
            goto L32
        L2f:
            r3.unregister()     // Catch: java.lang.Throwable -> L103
        L32:
            r3.register(r11)     // Catch: java.lang.Throwable -> L103
            java.util.concurrent.FutureTask r11 = new java.util.concurrent.FutureTask     // Catch: java.lang.Throwable -> L103
            androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda2 r4 = new androidx.core.location.LocationManagerCompat$$ExternalSyntheticLambda2     // Catch: java.lang.Throwable -> L103
            r4.<init>(r9, r3)     // Catch: java.lang.Throwable -> L103
            r11.<init>(r4)     // Catch: java.lang.Throwable -> L103
            android.os.Looper r9 = android.os.Looper.myLooper()     // Catch: java.lang.Throwable -> L103
            android.os.Looper r4 = r10.getLooper()     // Catch: java.lang.Throwable -> L103
            if (r9 != r4) goto L4d
            r11.run()     // Catch: java.lang.Throwable -> L103
            goto L53
        L4d:
            boolean r9 = r10.post(r11)     // Catch: java.lang.Throwable -> L103
            if (r9 == 0) goto Lec
        L53:
            java.util.concurrent.TimeUnit r9 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.Throwable -> L9f java.util.concurrent.TimeoutException -> La2 java.util.concurrent.ExecutionException -> Lbb
            r4 = 5
            long r4 = r9.toNanos(r4)     // Catch: java.lang.Throwable -> L9f java.util.concurrent.TimeoutException -> La2 java.util.concurrent.ExecutionException -> Lbb
            long r6 = java.lang.System.nanoTime()     // Catch: java.lang.Throwable -> L9f java.util.concurrent.TimeoutException -> La2 java.util.concurrent.ExecutionException -> Lbb
            long r6 = r6 + r4
            r9 = 0
        L61:
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.NANOSECONDS     // Catch: java.lang.Throwable -> L8a java.util.concurrent.TimeoutException -> L8d java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L93
            java.lang.Object r4 = r11.get(r4, r8)     // Catch: java.lang.Throwable -> L8a java.util.concurrent.TimeoutException -> L8d java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L93
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> L8a java.util.concurrent.TimeoutException -> L8d java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L93
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> L8a java.util.concurrent.TimeoutException -> L8d java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L93
            if (r4 == 0) goto L7f
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r4 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners     // Catch: java.lang.Throwable -> L8a java.util.concurrent.TimeoutException -> L8d java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L93
            r4.put(r12, r3)     // Catch: java.lang.Throwable -> L8a java.util.concurrent.TimeoutException -> L8d java.util.concurrent.ExecutionException -> L90 java.lang.InterruptedException -> L93
            if (r9 == 0) goto L7d
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L103
            r9.interrupt()     // Catch: java.lang.Throwable -> L103
        L7d:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L103
            return r0
        L7f:
            if (r9 == 0) goto L88
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L103
            r9.interrupt()     // Catch: java.lang.Throwable -> L103
        L88:
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L103
            return r1
        L8a:
            r10 = move-exception
            r0 = r9
            goto Le2
        L8d:
            r11 = move-exception
            r0 = r9
            goto La4
        L90:
            r10 = move-exception
            r0 = r9
            goto Lbd
        L93:
            long r4 = java.lang.System.nanoTime()     // Catch: java.util.concurrent.TimeoutException -> L9b java.util.concurrent.ExecutionException -> L9d java.lang.Throwable -> Le1
            long r4 = r6 - r4
            r9 = 1
            goto L61
        L9b:
            r11 = move-exception
            goto La4
        L9d:
            r10 = move-exception
            goto Lbd
        L9f:
            r10 = move-exception
            r0 = 0
            goto Le2
        La2:
            r11 = move-exception
            r0 = 0
        La4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le1
            java.lang.StringBuilder r12 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Le1
            r12.<init>()     // Catch: java.lang.Throwable -> Le1
            r12.append(r10)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r10 = " appears to be blocked, please run registerGnssStatusCallback() directly on a Looper thread or ensure the main Looper is not blocked by this thread"
            r12.append(r10)     // Catch: java.lang.Throwable -> Le1
            java.lang.String r10 = r12.toString()     // Catch: java.lang.Throwable -> Le1
            r9.<init>(r10, r11)     // Catch: java.lang.Throwable -> Le1
            throw r9     // Catch: java.lang.Throwable -> Le1
        Lbb:
            r10 = move-exception
            r0 = 0
        Lbd:
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> Le1
            boolean r9 = r9 instanceof java.lang.RuntimeException     // Catch: java.lang.Throwable -> Le1
            if (r9 != 0) goto Lda
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> Le1
            boolean r9 = r9 instanceof java.lang.Error     // Catch: java.lang.Throwable -> Le1
            if (r9 == 0) goto Ld4
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> Le1
            java.lang.Error r9 = (java.lang.Error) r9     // Catch: java.lang.Throwable -> Le1
            throw r9     // Catch: java.lang.Throwable -> Le1
        Ld4:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> Le1
            r9.<init>(r10)     // Catch: java.lang.Throwable -> Le1
            throw r9     // Catch: java.lang.Throwable -> Le1
        Lda:
            java.lang.Throwable r9 = r10.getCause()     // Catch: java.lang.Throwable -> Le1
            java.lang.RuntimeException r9 = (java.lang.RuntimeException) r9     // Catch: java.lang.Throwable -> Le1
            throw r9     // Catch: java.lang.Throwable -> Le1
        Le1:
            r10 = move-exception
        Le2:
            if (r0 == 0) goto Leb
            java.lang.Thread r9 = java.lang.Thread.currentThread()     // Catch: java.lang.Throwable -> L103
            r9.interrupt()     // Catch: java.lang.Throwable -> L103
        Leb:
            throw r10     // Catch: java.lang.Throwable -> L103
        Lec:
            java.lang.IllegalStateException r9 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L103
            java.lang.StringBuilder r11 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L103
            r11.<init>()     // Catch: java.lang.Throwable -> L103
            r11.append(r10)     // Catch: java.lang.Throwable -> L103
            java.lang.String r10 = " is shutting down"
            r11.append(r10)     // Catch: java.lang.Throwable -> L103
            java.lang.String r10 = r11.toString()     // Catch: java.lang.Throwable -> L103
            r9.<init>(r10)     // Catch: java.lang.Throwable -> L103
            throw r9     // Catch: java.lang.Throwable -> L103
        L103:
            r9 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L103
            throw r9
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull androidx.core.location.GnssStatusCompat.Callback r3, @androidx.annotation.NonNull android.os.Handler r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lf
            java.util.concurrent.Executor r4 = androidx.core.os.ExecutorCompat.create(r4)
            boolean r2 = registerGnssStatusCallback(r2, r4, r3)
            return r2
        Lf:
            androidx.core.location.LocationManagerCompat$InlineHandlerExecutor r0 = new androidx.core.location.LocationManagerCompat$InlineHandlerExecutor
            r0.<init>(r4)
            boolean r2 = registerGnssStatusCallback(r2, r0, r3)
            return r2
    }

    @androidx.annotation.RequiresPermission("android.permission.ACCESS_FINE_LOCATION")
    public static boolean registerGnssStatusCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull java.util.concurrent.Executor r3, @androidx.annotation.NonNull androidx.core.location.GnssStatusCompat.Callback r4) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 30
            if (r0 < r1) goto Lc
            r0 = 0
            boolean r2 = registerGnssStatusCallback(r2, r0, r3, r4)
            return r2
        Lc:
            android.os.Looper r0 = android.os.Looper.myLooper()
            if (r0 != 0) goto L16
            android.os.Looper r0 = android.os.Looper.getMainLooper()
        L16:
            android.os.Handler r1 = new android.os.Handler
            r1.<init>(r0)
            boolean r2 = registerGnssStatusCallback(r2, r1, r3, r4)
            return r2
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    @androidx.annotation.GuardedBy("sLocationListeners")
    public static void registerLocationListenerTransport(android.location.LocationManager r3, androidx.core.location.LocationManagerCompat.LocationListenerTransport r4) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = r4.getKey()
            java.lang.ref.WeakReference r2 = new java.lang.ref.WeakReference
            r2.<init>(r4)
            java.lang.Object r4 = r0.put(r1, r2)
            java.lang.ref.WeakReference r4 = (java.lang.ref.WeakReference) r4
            if (r4 == 0) goto L1a
            java.lang.Object r4 = r4.get()
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r4 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r4
            goto L1b
        L1a:
            r4 = 0
        L1b:
            if (r4 == 0) goto L23
            r4.unregister()
            r3.removeUpdates(r4)
        L23:
            return
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void removeUpdates(@androidx.annotation.NonNull android.location.LocationManager r6, @androidx.annotation.NonNull androidx.core.location.LocationListenerCompat r7) {
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r0 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r0)
            r1 = 0
            java.util.Collection r2 = r0.values()     // Catch: java.lang.Throwable -> L57
            java.util.Iterator r2 = r2.iterator()     // Catch: java.lang.Throwable -> L57
        Lc:
            boolean r3 = r2.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r3 == 0) goto L3a
            java.lang.Object r3 = r2.next()     // Catch: java.lang.Throwable -> L57
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3     // Catch: java.lang.Throwable -> L57
            java.lang.Object r3 = r3.get()     // Catch: java.lang.Throwable -> L57
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r3 = (androidx.core.location.LocationManagerCompat.LocationListenerTransport) r3     // Catch: java.lang.Throwable -> L57
            if (r3 != 0) goto L21
            goto Lc
        L21:
            androidx.core.location.LocationManagerCompat$LocationListenerKey r4 = r3.getKey()     // Catch: java.lang.Throwable -> L57
            androidx.core.location.LocationListenerCompat r5 = r4.mListener     // Catch: java.lang.Throwable -> L57
            if (r5 != r7) goto Lc
            if (r1 != 0) goto L30
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L57
            r1.<init>()     // Catch: java.lang.Throwable -> L57
        L30:
            r1.add(r4)     // Catch: java.lang.Throwable -> L57
            r3.unregister()     // Catch: java.lang.Throwable -> L57
            r6.removeUpdates(r3)     // Catch: java.lang.Throwable -> L57
            goto Lc
        L3a:
            if (r1 == 0) goto L52
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L57
        L40:
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L57
            if (r2 == 0) goto L52
            java.lang.Object r2 = r1.next()     // Catch: java.lang.Throwable -> L57
            androidx.core.location.LocationManagerCompat$LocationListenerKey r2 = (androidx.core.location.LocationManagerCompat.LocationListenerKey) r2     // Catch: java.lang.Throwable -> L57
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r3 = androidx.core.location.LocationManagerCompat.sLocationListeners     // Catch: java.lang.Throwable -> L57
            r3.remove(r2)     // Catch: java.lang.Throwable -> L57
            goto L40
        L52:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            r6.removeUpdates(r7)
            return
        L57:
            r6 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L57
            throw r6
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull androidx.core.location.LocationRequestCompat r10, @androidx.annotation.NonNull androidx.core.location.LocationListenerCompat r11, @androidx.annotation.NonNull android.os.Looper r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto L17
            android.location.LocationRequest r10 = r10.toLocationRequest()
            android.os.Handler r0 = new android.os.Handler
            r0.<init>(r12)
            java.util.concurrent.Executor r12 = androidx.core.os.ExecutorCompat.create(r0)
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r10, r12, r11)
            return
        L17:
            boolean r0 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L1e
            return
        L1e:
            long r3 = r10.getIntervalMillis()
            float r5 = r10.getMinUpdateDistanceMeters()
            r1 = r8
            r2 = r9
            r6 = r11
            r7 = r12
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)
            return
    }

    @androidx.annotation.RequiresPermission(anyOf = {"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"})
    public static void requestLocationUpdates(@androidx.annotation.NonNull android.location.LocationManager r8, @androidx.annotation.NonNull java.lang.String r9, @androidx.annotation.NonNull androidx.core.location.LocationRequestCompat r10, @androidx.annotation.NonNull java.util.concurrent.Executor r11, @androidx.annotation.NonNull androidx.core.location.LocationListenerCompat r12) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 31
            if (r0 < r1) goto Le
            android.location.LocationRequest r10 = r10.toLocationRequest()
            androidx.core.location.LocationManagerCompat.Api31Impl.requestLocationUpdates(r8, r9, r10, r11, r12)
            return
        Le:
            r1 = 30
            if (r0 < r1) goto L19
            boolean r0 = androidx.core.location.LocationManagerCompat.Api30Impl.tryRequestLocationUpdates(r8, r9, r10, r11, r12)
            if (r0 == 0) goto L19
            return
        L19:
            androidx.core.location.LocationManagerCompat$LocationListenerTransport r0 = new androidx.core.location.LocationManagerCompat$LocationListenerTransport
            androidx.core.location.LocationManagerCompat$LocationListenerKey r1 = new androidx.core.location.LocationManagerCompat$LocationListenerKey
            r1.<init>(r9, r12)
            r0.<init>(r1, r11)
            boolean r11 = androidx.core.location.LocationManagerCompat.Api19Impl.tryRequestLocationUpdates(r8, r9, r10, r0)
            if (r11 == 0) goto L2a
            return
        L2a:
            java.util.WeakHashMap<androidx.core.location.LocationManagerCompat$LocationListenerKey, java.lang.ref.WeakReference<androidx.core.location.LocationManagerCompat$LocationListenerTransport>> r11 = androidx.core.location.LocationManagerCompat.sLocationListeners
            monitor-enter(r11)
            long r3 = r10.getIntervalMillis()     // Catch: java.lang.Throwable -> L44
            float r5 = r10.getMinUpdateDistanceMeters()     // Catch: java.lang.Throwable -> L44
            android.os.Looper r7 = android.os.Looper.getMainLooper()     // Catch: java.lang.Throwable -> L44
            r1 = r8
            r2 = r9
            r6 = r0
            r1.requestLocationUpdates(r2, r3, r5, r6, r7)     // Catch: java.lang.Throwable -> L44
            registerLocationListenerTransport(r8, r0)     // Catch: java.lang.Throwable -> L44
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L44
            return
        L44:
            r8 = move-exception
            monitor-exit(r11)     // Catch: java.lang.Throwable -> L44
            throw r8
    }

    @androidx.annotation.RequiresApi(24)
    public static void unregisterGnssMeasurementsCallback(@androidx.annotation.NonNull android.location.LocationManager r0, @androidx.annotation.NonNull android.location.GnssMeasurementsEvent.Callback r1) {
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssMeasurementsCallback(r0, r1)
            return
    }

    public static void unregisterGnssStatusCallback(@androidx.annotation.NonNull android.location.LocationManager r2, @androidx.annotation.NonNull androidx.core.location.GnssStatusCompat.Callback r3) {
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 24
            if (r0 < r1) goto L17
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L14
            if (r3 == 0) goto L12
            androidx.core.location.LocationManagerCompat.Api24Impl.unregisterGnssStatusCallback(r2, r3)     // Catch: java.lang.Throwable -> L14
        L12:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            goto L29
        L14:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L14
            throw r2
        L17:
            androidx.collection.SimpleArrayMap<java.lang.Object, java.lang.Object> r0 = androidx.core.location.LocationManagerCompat.GnssListenersHolder.sGnssStatusListeners
            monitor-enter(r0)
            java.lang.Object r3 = r0.remove(r3)     // Catch: java.lang.Throwable -> L2a
            androidx.core.location.LocationManagerCompat$GpsStatusTransport r3 = (androidx.core.location.LocationManagerCompat.GpsStatusTransport) r3     // Catch: java.lang.Throwable -> L2a
            if (r3 == 0) goto L28
            r3.unregister()     // Catch: java.lang.Throwable -> L2a
            r2.removeGpsStatusListener(r3)     // Catch: java.lang.Throwable -> L2a
        L28:
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
        L29:
            return
        L2a:
            r2 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
            throw r2
    }
}
