package com.google.android.exoplayer2.extractor;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultExtractorsFactory implements com.google.android.exoplayer2.extractor.ExtractorsFactory {
    private static final int[] DEFAULT_EXTRACTOR_ORDER = null;
    private static final com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader FLAC_EXTENSION_LOADER = null;
    private static final com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader MIDI_EXTENSION_LOADER = null;
    private int adtsFlags;
    private int amrFlags;
    private boolean constantBitrateSeekingAlwaysEnabled;
    private boolean constantBitrateSeekingEnabled;
    private int flacFlags;
    private int fragmentedMp4Flags;
    private int matroskaFlags;
    private int mp3Flags;
    private int mp4Flags;
    private int tsFlags;
    private int tsMode;
    private com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Format> tsSubtitleFormats;
    private int tsTimestampSearchBytes;

    /* JADX INFO: loaded from: classes.dex */
    public static final class ExtensionLoader {
        private final com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier constructorSupplier;
        private final java.util.concurrent.atomic.AtomicBoolean extensionLoaded;

        @androidx.annotation.Nullable
        @androidx.annotation.GuardedBy("extensionLoaded")
        private java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> extractorConstructor;

        public interface ConstructorSupplier {
            @androidx.annotation.Nullable
            java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> getConstructor() throws java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException, java.lang.NoSuchMethodException, java.lang.ClassNotFoundException;
        }

        public ExtensionLoader(com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.ExtensionLoader.ConstructorSupplier r2) {
                r1 = this;
                r1.<init>()
                r1.constructorSupplier = r2
                java.util.concurrent.atomic.AtomicBoolean r2 = new java.util.concurrent.atomic.AtomicBoolean
                r0 = 0
                r2.<init>(r0)
                r1.extensionLoaded = r2
                return
        }

        @androidx.annotation.Nullable
        private java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> maybeLoadExtractorConstructor() {
                r4 = this;
                java.util.concurrent.atomic.AtomicBoolean r0 = r4.extensionLoaded
                monitor-enter(r0)
                java.util.concurrent.atomic.AtomicBoolean r1 = r4.extensionLoaded     // Catch: java.lang.Throwable -> L2a
                boolean r1 = r1.get()     // Catch: java.lang.Throwable -> L2a
                if (r1 == 0) goto Lf
                java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> r1 = r4.extractorConstructor     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                return r1
            Lf:
                com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader$ConstructorSupplier r1 = r4.constructorSupplier     // Catch: java.lang.Exception -> L17 java.lang.ClassNotFoundException -> L20 java.lang.Throwable -> L2a
                java.lang.reflect.Constructor r1 = r1.getConstructor()     // Catch: java.lang.Exception -> L17 java.lang.ClassNotFoundException -> L20 java.lang.Throwable -> L2a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                return r1
            L17:
                r1 = move-exception
                java.lang.RuntimeException r2 = new java.lang.RuntimeException     // Catch: java.lang.Throwable -> L2a
                java.lang.String r3 = "Error instantiating extension"
                r2.<init>(r3, r1)     // Catch: java.lang.Throwable -> L2a
                throw r2     // Catch: java.lang.Throwable -> L2a
            L20:
                java.util.concurrent.atomic.AtomicBoolean r1 = r4.extensionLoaded     // Catch: java.lang.Throwable -> L2a
                r2 = 1
                r1.set(r2)     // Catch: java.lang.Throwable -> L2a
                java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> r1 = r4.extractorConstructor     // Catch: java.lang.Throwable -> L2a
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                return r1
            L2a:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L2a
                throw r1
        }

        @androidx.annotation.Nullable
        public com.google.android.exoplayer2.extractor.Extractor getExtractor(java.lang.Object... r3) {
                r2 = this;
                java.lang.reflect.Constructor r0 = r2.maybeLoadExtractorConstructor()
                if (r0 != 0) goto L8
                r3 = 0
                return r3
            L8:
                java.lang.Object r3 = r0.newInstance(r3)     // Catch: java.lang.Exception -> Lf
                com.google.android.exoplayer2.extractor.Extractor r3 = (com.google.android.exoplayer2.extractor.Extractor) r3     // Catch: java.lang.Exception -> Lf
                return r3
            Lf:
                r3 = move-exception
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "Unexpected error creating extractor"
                r0.<init>(r1, r3)
                throw r0
        }
    }

    /* JADX INFO: renamed from: $r8$lambda$KA91uXS3do9mxsnM-plEBujl2vs, reason: not valid java name */
    public static /* synthetic */ java.lang.reflect.Constructor m222$r8$lambda$KA91uXS3do9mxsnMplEBujl2vs() {
            java.lang.reflect.Constructor r0 = getMidiExtractorConstructor()
            return r0
    }

    public static /* synthetic */ java.lang.reflect.Constructor $r8$lambda$UB0XGN4xVYWMpbhQ5lQLSZUR148() {
            java.lang.reflect.Constructor r0 = getFlacExtractorConstructor()
            return r0
    }

    static {
            r0 = 16
            int[] r0 = new int[r0]
            r0 = {x001c: FILL_ARRAY_DATA , data: [5, 4, 12, 8, 3, 10, 9, 11, 6, 2, 0, 1, 7, 16, 15, 14} // fill-array
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.DEFAULT_EXTRACTOR_ORDER = r0
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader r0 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r1 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$26
            r0.<init>(r1)
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.FLAC_EXTENSION_LOADER = r0
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader r0 = new com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader
            com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0 r1 = com.flextv.livestore.apps.BaseActivity$$ExternalSyntheticLambda0.INSTANCE$27
            r0.<init>(r1)
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.MIDI_EXTENSION_LOADER = r0
            return
    }

    public DefaultExtractorsFactory() {
            r1 = this;
            r1.<init>()
            r0 = 1
            r1.tsMode = r0
            r0 = 112800(0x1b8a0, float:1.58066E-40)
            r1.tsTimestampSearchBytes = r0
            com.google.common.collect.ImmutableList r0 = com.google.common.collect.ImmutableList.of()
            r1.tsSubtitleFormats = r0
            return
    }

    private void addExtractorsForFileType(int r6, java.util.List<com.google.android.exoplayer2.extractor.Extractor> r7) {
            r5 = this;
            r0 = 2
            r1 = 0
            switch(r6) {
                case 0: goto Lfb;
                case 1: goto Lf2;
                case 2: goto Ldd;
                case 3: goto Lc8;
                case 4: goto La6;
                case 5: goto L9d;
                case 6: goto L92;
                case 7: goto L7c;
                case 8: goto L66;
                case 9: goto L5c;
                case 10: goto L52;
                case 11: goto L34;
                case 12: goto L2a;
                case 13: goto L5;
                case 14: goto L20;
                case 15: goto L11;
                case 16: goto L7;
                default: goto L5;
            }
        L5:
            goto L103
        L7:
            com.google.android.exoplayer2.extractor.avi.AviExtractor r6 = new com.google.android.exoplayer2.extractor.avi.AviExtractor
            r6.<init>()
            r7.add(r6)
            goto L103
        L11:
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader r6 = com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.MIDI_EXTENSION_LOADER
            java.lang.Object[] r0 = new java.lang.Object[r1]
            com.google.android.exoplayer2.extractor.Extractor r6 = r6.getExtractor(r0)
            if (r6 == 0) goto L103
            r7.add(r6)
            goto L103
        L20:
            com.google.android.exoplayer2.extractor.jpeg.JpegExtractor r6 = new com.google.android.exoplayer2.extractor.jpeg.JpegExtractor
            r6.<init>()
            r7.add(r6)
            goto L103
        L2a:
            com.google.android.exoplayer2.extractor.wav.WavExtractor r6 = new com.google.android.exoplayer2.extractor.wav.WavExtractor
            r6.<init>()
            r7.add(r6)
            goto L103
        L34:
            com.google.android.exoplayer2.extractor.ts.TsExtractor r6 = new com.google.android.exoplayer2.extractor.ts.TsExtractor
            int r0 = r5.tsMode
            com.google.android.exoplayer2.util.TimestampAdjuster r1 = new com.google.android.exoplayer2.util.TimestampAdjuster
            r2 = 0
            r1.<init>(r2)
            com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory r2 = new com.google.android.exoplayer2.extractor.ts.DefaultTsPayloadReaderFactory
            int r3 = r5.tsFlags
            com.google.common.collect.ImmutableList<com.google.android.exoplayer2.Format> r4 = r5.tsSubtitleFormats
            r2.<init>(r3, r4)
            int r3 = r5.tsTimestampSearchBytes
            r6.<init>(r0, r1, r2, r3)
            r7.add(r6)
            goto L103
        L52:
            com.google.android.exoplayer2.extractor.ts.PsExtractor r6 = new com.google.android.exoplayer2.extractor.ts.PsExtractor
            r6.<init>()
            r7.add(r6)
            goto L103
        L5c:
            com.google.android.exoplayer2.extractor.ogg.OggExtractor r6 = new com.google.android.exoplayer2.extractor.ogg.OggExtractor
            r6.<init>()
            r7.add(r6)
            goto L103
        L66:
            com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor r6 = new com.google.android.exoplayer2.extractor.mp4.FragmentedMp4Extractor
            int r0 = r5.fragmentedMp4Flags
            r6.<init>(r0)
            r7.add(r6)
            com.google.android.exoplayer2.extractor.mp4.Mp4Extractor r6 = new com.google.android.exoplayer2.extractor.mp4.Mp4Extractor
            int r0 = r5.mp4Flags
            r6.<init>(r0)
            r7.add(r6)
            goto L103
        L7c:
            com.google.android.exoplayer2.extractor.mp3.Mp3Extractor r6 = new com.google.android.exoplayer2.extractor.mp3.Mp3Extractor
            int r2 = r5.mp3Flags
            boolean r3 = r5.constantBitrateSeekingEnabled
            r2 = r2 | r3
            boolean r3 = r5.constantBitrateSeekingAlwaysEnabled
            if (r3 == 0) goto L88
            goto L89
        L88:
            r0 = 0
        L89:
            r0 = r0 | r2
            r6.<init>(r0)
            r7.add(r6)
            goto L103
        L92:
            com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor r6 = new com.google.android.exoplayer2.extractor.mkv.MatroskaExtractor
            int r0 = r5.matroskaFlags
            r6.<init>(r0)
            r7.add(r6)
            goto L103
        L9d:
            com.google.android.exoplayer2.extractor.flv.FlvExtractor r6 = new com.google.android.exoplayer2.extractor.flv.FlvExtractor
            r6.<init>()
            r7.add(r6)
            goto L103
        La6:
            com.google.android.exoplayer2.extractor.DefaultExtractorsFactory$ExtensionLoader r6 = com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.FLAC_EXTENSION_LOADER
            r0 = 1
            java.lang.Object[] r0 = new java.lang.Object[r0]
            int r2 = r5.flacFlags
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0[r1] = r2
            com.google.android.exoplayer2.extractor.Extractor r6 = r6.getExtractor(r0)
            if (r6 == 0) goto Lbd
            r7.add(r6)
            goto L103
        Lbd:
            com.google.android.exoplayer2.extractor.flac.FlacExtractor r6 = new com.google.android.exoplayer2.extractor.flac.FlacExtractor
            int r0 = r5.flacFlags
            r6.<init>(r0)
            r7.add(r6)
            goto L103
        Lc8:
            com.google.android.exoplayer2.extractor.amr.AmrExtractor r6 = new com.google.android.exoplayer2.extractor.amr.AmrExtractor
            int r2 = r5.amrFlags
            boolean r3 = r5.constantBitrateSeekingEnabled
            r2 = r2 | r3
            boolean r3 = r5.constantBitrateSeekingAlwaysEnabled
            if (r3 == 0) goto Ld4
            goto Ld5
        Ld4:
            r0 = 0
        Ld5:
            r0 = r0 | r2
            r6.<init>(r0)
            r7.add(r6)
            goto L103
        Ldd:
            com.google.android.exoplayer2.extractor.ts.AdtsExtractor r6 = new com.google.android.exoplayer2.extractor.ts.AdtsExtractor
            int r2 = r5.adtsFlags
            boolean r3 = r5.constantBitrateSeekingEnabled
            r2 = r2 | r3
            boolean r3 = r5.constantBitrateSeekingAlwaysEnabled
            if (r3 == 0) goto Le9
            goto Lea
        Le9:
            r0 = 0
        Lea:
            r0 = r0 | r2
            r6.<init>(r0)
            r7.add(r6)
            goto L103
        Lf2:
            com.google.android.exoplayer2.extractor.ts.Ac4Extractor r6 = new com.google.android.exoplayer2.extractor.ts.Ac4Extractor
            r6.<init>()
            r7.add(r6)
            goto L103
        Lfb:
            com.google.android.exoplayer2.extractor.ts.Ac3Extractor r6 = new com.google.android.exoplayer2.extractor.ts.Ac3Extractor
            r6.<init>()
            r7.add(r6)
        L103:
            return
    }

    @androidx.annotation.Nullable
    private static java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> getFlacExtractorConstructor() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException, java.lang.reflect.InvocationTargetException, java.lang.IllegalAccessException {
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            java.lang.String r1 = "com.google.android.exoplayer2.ext.flac.FlacLibrary"
            java.lang.Class r1 = java.lang.Class.forName(r1)
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]
            java.lang.String r4 = "isAvailable"
            java.lang.reflect.Method r1 = r1.getMethod(r4, r3)
            java.lang.Object[] r3 = new java.lang.Object[r2]
            r4 = 0
            java.lang.Object r1 = r1.invoke(r4, r3)
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L36
            java.lang.String r0 = "com.google.android.exoplayer2.ext.flac.FlacExtractor"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Class<com.google.android.exoplayer2.extractor.Extractor> r1 = com.google.android.exoplayer2.extractor.Extractor.class
            java.lang.Class r0 = r0.asSubclass(r1)
            r1 = 1
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.Class r3 = java.lang.Integer.TYPE
            r1[r2] = r3
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            return r0
        L36:
            return r4
    }

    private static java.lang.reflect.Constructor<? extends com.google.android.exoplayer2.extractor.Extractor> getMidiExtractorConstructor() throws java.lang.ClassNotFoundException, java.lang.NoSuchMethodException {
            java.lang.String r0 = "com.google.android.exoplayer2.decoder.midi.MidiExtractor"
            java.lang.Class r0 = java.lang.Class.forName(r0)
            java.lang.Class<com.google.android.exoplayer2.extractor.Extractor> r1 = com.google.android.exoplayer2.extractor.Extractor.class
            java.lang.Class r0 = r0.asSubclass(r1)
            r1 = 0
            java.lang.Class[] r1 = new java.lang.Class[r1]
            java.lang.reflect.Constructor r0 = r0.getConstructor(r1)
            return r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized com.google.android.exoplayer2.extractor.Extractor[] createExtractors() {
            r2 = this;
            monitor-enter(r2)
            android.net.Uri r0 = android.net.Uri.EMPTY     // Catch: java.lang.Throwable -> Le
            java.util.HashMap r1 = new java.util.HashMap     // Catch: java.lang.Throwable -> Le
            r1.<init>()     // Catch: java.lang.Throwable -> Le
            com.google.android.exoplayer2.extractor.Extractor[] r0 = r2.createExtractors(r0, r1)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r2)
            return r0
        Le:
            r0 = move-exception
            monitor-exit(r2)
            throw r0
    }

    @Override // com.google.android.exoplayer2.extractor.ExtractorsFactory
    public synchronized com.google.android.exoplayer2.extractor.Extractor[] createExtractors(android.net.Uri r6, java.util.Map<java.lang.String, java.util.List<java.lang.String>> r7) {
            r5 = this;
            monitor-enter(r5)
            java.util.ArrayList r0 = new java.util.ArrayList     // Catch: java.lang.Throwable -> L3c
            int[] r1 = com.google.android.exoplayer2.extractor.DefaultExtractorsFactory.DEFAULT_EXTRACTOR_ORDER     // Catch: java.lang.Throwable -> L3c
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3c
            r0.<init>(r2)     // Catch: java.lang.Throwable -> L3c
            int r7 = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromResponseHeaders(r7)     // Catch: java.lang.Throwable -> L3c
            r2 = -1
            if (r7 == r2) goto L13
            r5.addExtractorsForFileType(r7, r0)     // Catch: java.lang.Throwable -> L3c
        L13:
            int r6 = com.google.android.exoplayer2.util.FileTypes.inferFileTypeFromUri(r6)     // Catch: java.lang.Throwable -> L3c
            if (r6 == r2) goto L1e
            if (r6 == r7) goto L1e
            r5.addExtractorsForFileType(r6, r0)     // Catch: java.lang.Throwable -> L3c
        L1e:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L3c
            r3 = 0
        L20:
            if (r3 >= r2) goto L2e
            r4 = r1[r3]     // Catch: java.lang.Throwable -> L3c
            if (r4 == r7) goto L2b
            if (r4 == r6) goto L2b
            r5.addExtractorsForFileType(r4, r0)     // Catch: java.lang.Throwable -> L3c
        L2b:
            int r3 = r3 + 1
            goto L20
        L2e:
            int r6 = r0.size()     // Catch: java.lang.Throwable -> L3c
            com.google.android.exoplayer2.extractor.Extractor[] r6 = new com.google.android.exoplayer2.extractor.Extractor[r6]     // Catch: java.lang.Throwable -> L3c
            java.lang.Object[] r6 = r0.toArray(r6)     // Catch: java.lang.Throwable -> L3c
            com.google.android.exoplayer2.extractor.Extractor[] r6 = (com.google.android.exoplayer2.extractor.Extractor[]) r6     // Catch: java.lang.Throwable -> L3c
            monitor-exit(r5)
            return r6
        L3c:
            r6 = move-exception
            monitor-exit(r5)
            throw r6
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setAdtsExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.adtsFlags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setAmrExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.amrFlags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setConstantBitrateSeekingAlwaysEnabled(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.constantBitrateSeekingAlwaysEnabled = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setConstantBitrateSeekingEnabled(boolean r1) {
            r0 = this;
            monitor-enter(r0)
            r0.constantBitrateSeekingEnabled = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setFlacExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.flacFlags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setFragmentedMp4ExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.fragmentedMp4Flags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setMatroskaExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.matroskaFlags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setMp3ExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mp3Flags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setMp4ExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.mp4Flags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsExtractorFlags(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.tsFlags = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsExtractorMode(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.tsMode = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsExtractorTimestampSearchBytes(int r1) {
            r0 = this;
            monitor-enter(r0)
            r0.tsTimestampSearchBytes = r1     // Catch: java.lang.Throwable -> L5
            monitor-exit(r0)
            return r0
        L5:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }

    @com.google.errorprone.annotations.CanIgnoreReturnValue
    public synchronized com.google.android.exoplayer2.extractor.DefaultExtractorsFactory setTsSubtitleFormats(java.util.List<com.google.android.exoplayer2.Format> r1) {
            r0 = this;
            monitor-enter(r0)
            com.google.common.collect.ImmutableList r1 = com.google.common.collect.ImmutableList.copyOf(r1)     // Catch: java.lang.Throwable -> L9
            r0.tsSubtitleFormats = r1     // Catch: java.lang.Throwable -> L9
            monitor-exit(r0)
            return r0
        L9:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
    }
}
