package com.google.common.cache;

/* JADX INFO: loaded from: classes.dex */
@com.google.common.cache.ElementTypesAreNonnullByDefault
@com.google.common.annotations.GwtIncompatible
public final class CacheBuilderSpec {
    private static final com.google.common.base.Splitter KEYS_SPLITTER = null;
    private static final com.google.common.base.Splitter KEY_VALUE_SPLITTER = null;
    private static final com.google.common.collect.ImmutableMap<java.lang.String, com.google.common.cache.CacheBuilderSpec.ValueParser> VALUE_PARSERS = null;

    @com.google.common.annotations.VisibleForTesting
    public long accessExpirationDuration;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.util.concurrent.TimeUnit accessExpirationTimeUnit;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.lang.Integer concurrencyLevel;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.lang.Integer initialCapacity;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public com.google.common.cache.LocalCache.Strength keyStrength;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.lang.Long maximumSize;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.lang.Long maximumWeight;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.lang.Boolean recordStats;

    @com.google.common.annotations.VisibleForTesting
    public long refreshDuration;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.util.concurrent.TimeUnit refreshTimeUnit;
    private final java.lang.String specification;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public com.google.common.cache.LocalCache.Strength valueStrength;

    @com.google.common.annotations.VisibleForTesting
    public long writeExpirationDuration;

    @com.google.common.annotations.VisibleForTesting
    @javax.annotation.CheckForNull
    public java.util.concurrent.TimeUnit writeExpirationTimeUnit;

    /* JADX INFO: renamed from: com.google.common.cache.CacheBuilderSpec$1, reason: invalid class name */
    /* JADX INFO: loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        public static final /* synthetic */ int[] $SwitchMap$com$google$common$cache$LocalCache$Strength = null;

        static {
                com.google.common.cache.LocalCache$Strength[] r0 = com.google.common.cache.LocalCache.Strength.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength = r0
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.WEAK     // Catch: java.lang.NoSuchFieldError -> L12
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L12
                r2 = 1
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L12
            L12:
                int[] r0 = com.google.common.cache.CacheBuilderSpec.AnonymousClass1.$SwitchMap$com$google$common$cache$LocalCache$Strength     // Catch: java.lang.NoSuchFieldError -> L1d
                com.google.common.cache.LocalCache$Strength r1 = com.google.common.cache.LocalCache.Strength.SOFT     // Catch: java.lang.NoSuchFieldError -> L1d
                int r1 = r1.ordinal()     // Catch: java.lang.NoSuchFieldError -> L1d
                r2 = 2
                r0[r1] = r2     // Catch: java.lang.NoSuchFieldError -> L1d
            L1d:
                return
        }
    }

    public static class AccessDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        public AccessDurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        public final void parseDuration(com.google.common.cache.CacheBuilderSpec r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = r3.accessExpirationTimeUnit
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "expireAfterAccess already set"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r3.accessExpirationDuration = r4
                r3.accessExpirationTimeUnit = r6
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class ConcurrencyLevelParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        public ConcurrencyLevelParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        public final void parseInteger(com.google.common.cache.CacheBuilderSpec r4, int r5) {
                r3 = this;
                java.lang.Integer r0 = r4.concurrencyLevel
                if (r0 != 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                java.lang.String r2 = "concurrency level was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.concurrencyLevel = r5
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class DurationParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        public DurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r7, java.lang.String r8, @javax.annotation.CheckForNull java.lang.String r9) {
                r6 = this;
                boolean r0 = com.google.common.base.Strings.isNullOrEmpty(r9)
                if (r0 != 0) goto L62
                r0 = 2
                r1 = 0
                r2 = 1
                int r3 = r9.length()     // Catch: java.lang.NumberFormatException -> L50
                int r3 = r3 - r2
                char r3 = r9.charAt(r3)     // Catch: java.lang.NumberFormatException -> L50
                r4 = 100
                if (r3 == r4) goto L3d
                r4 = 104(0x68, float:1.46E-43)
                if (r3 == r4) goto L3a
                r4 = 109(0x6d, float:1.53E-43)
                if (r3 == r4) goto L37
                r4 = 115(0x73, float:1.61E-43)
                if (r3 != r4) goto L25
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS     // Catch: java.lang.NumberFormatException -> L50
                goto L3f
            L25:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException     // Catch: java.lang.NumberFormatException -> L50
                java.lang.String r3 = "key %s invalid unit: was %s, must end with one of [dhms]"
                java.lang.Object[] r4 = new java.lang.Object[r0]     // Catch: java.lang.NumberFormatException -> L50
                r4[r1] = r8     // Catch: java.lang.NumberFormatException -> L50
                r4[r2] = r9     // Catch: java.lang.NumberFormatException -> L50
                java.lang.String r3 = com.google.common.cache.CacheBuilderSpec.access$000(r3, r4)     // Catch: java.lang.NumberFormatException -> L50
                r7.<init>(r3)     // Catch: java.lang.NumberFormatException -> L50
                throw r7     // Catch: java.lang.NumberFormatException -> L50
            L37:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.MINUTES     // Catch: java.lang.NumberFormatException -> L50
                goto L3f
            L3a:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.HOURS     // Catch: java.lang.NumberFormatException -> L50
                goto L3f
            L3d:
                java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.DAYS     // Catch: java.lang.NumberFormatException -> L50
            L3f:
                int r4 = r9.length()     // Catch: java.lang.NumberFormatException -> L50
                int r4 = r4 - r2
                java.lang.String r4 = r9.substring(r1, r4)     // Catch: java.lang.NumberFormatException -> L50
                long r4 = java.lang.Long.parseLong(r4)     // Catch: java.lang.NumberFormatException -> L50
                r6.parseDuration(r7, r4, r3)     // Catch: java.lang.NumberFormatException -> L50
                return
            L50:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                java.lang.Object[] r0 = new java.lang.Object[r0]
                r0[r1] = r8
                r0[r2] = r9
                java.lang.String r8 = "key %s value set to %s, must be integer"
                java.lang.String r8 = com.google.common.cache.CacheBuilderSpec.access$000(r8, r0)
                r7.<init>(r8)
                throw r7
            L62:
                java.lang.IllegalArgumentException r7 = new java.lang.IllegalArgumentException
                r9 = 21
                int r9 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r8, r9)
                java.lang.String r0 = "value of key "
                java.lang.String r1 = " omitted"
                java.lang.String r8 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r9, r0, r8, r1)
                r7.<init>(r8)
                throw r7
        }

        public abstract void parseDuration(com.google.common.cache.CacheBuilderSpec r1, long r2, java.util.concurrent.TimeUnit r4);
    }

    public static class InitialCapacityParser extends com.google.common.cache.CacheBuilderSpec.IntegerParser {
        public InitialCapacityParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.IntegerParser
        public final void parseInteger(com.google.common.cache.CacheBuilderSpec r4, int r5) {
                r3 = this;
                java.lang.Integer r0 = r4.initialCapacity
                if (r0 != 0) goto L6
                r1 = 1
                goto L7
            L6:
                r1 = 0
            L7:
                java.lang.String r2 = "initial capacity was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                r4.initialCapacity = r5
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class IntegerParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        public IntegerParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r4, java.lang.String r5, java.lang.String r6) {
                r3 = this;
                boolean r0 = com.google.common.base.Strings.isNullOrEmpty(r6)
                if (r0 != 0) goto L24
                int r0 = java.lang.Integer.parseInt(r6)     // Catch: java.lang.NumberFormatException -> Le
                r3.parseInteger(r4, r0)     // Catch: java.lang.NumberFormatException -> Le
                return
            Le:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                r5 = 1
                r1[r5] = r6
                java.lang.String r5 = "key %s value set to %s, must be integer"
                java.lang.String r5 = com.google.common.cache.CacheBuilderSpec.access$000(r5, r1)
                r0.<init>(r5, r4)
                throw r0
            L24:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r6 = 21
                int r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r6)
                java.lang.String r0 = "value of key "
                java.lang.String r1 = " omitted"
                java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r0, r5, r1)
                r4.<init>(r5)
                throw r4
        }

        public abstract void parseInteger(com.google.common.cache.CacheBuilderSpec r1, int r2);
    }

    public static class KeyStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public KeyStrengthParser(com.google.common.cache.LocalCache.Strength r1) {
                r0 = this;
                r0.<init>()
                r0.strength = r1
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r4, java.lang.String r5, @javax.annotation.CheckForNull java.lang.String r6) {
                r3 = this;
                r0 = 1
                r1 = 0
                if (r6 != 0) goto L6
                r6 = 1
                goto L7
            L6:
                r6 = 0
            L7:
                java.lang.String r2 = "key %s does not take values"
                com.google.common.base.Preconditions.checkArgument(r6, r2, r5)
                com.google.common.cache.LocalCache$Strength r6 = r4.keyStrength
                if (r6 != 0) goto L11
                goto L12
            L11:
                r0 = 0
            L12:
                java.lang.String r1 = "%s was already set to %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r6)
                com.google.common.cache.LocalCache$Strength r5 = r3.strength
                r4.keyStrength = r5
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static abstract class LongParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        public LongParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r4, java.lang.String r5, java.lang.String r6) {
                r3 = this;
                boolean r0 = com.google.common.base.Strings.isNullOrEmpty(r6)
                if (r0 != 0) goto L24
                long r0 = java.lang.Long.parseLong(r6)     // Catch: java.lang.NumberFormatException -> Le
                r3.parseLong(r4, r0)     // Catch: java.lang.NumberFormatException -> Le
                return
            Le:
                r4 = move-exception
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                r1 = 2
                java.lang.Object[] r1 = new java.lang.Object[r1]
                r2 = 0
                r1[r2] = r5
                r5 = 1
                r1[r5] = r6
                java.lang.String r5 = "key %s value set to %s, must be integer"
                java.lang.String r5 = com.google.common.cache.CacheBuilderSpec.access$000(r5, r1)
                r0.<init>(r5, r4)
                throw r0
            L24:
                java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
                r6 = 21
                int r6 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r5, r6)
                java.lang.String r0 = "value of key "
                java.lang.String r1 = " omitted"
                java.lang.String r5 = kotlin.text.StringsKt__StringsKt$$ExternalSyntheticOutline0.m(r6, r0, r5, r1)
                r4.<init>(r5)
                throw r4
        }

        public abstract void parseLong(com.google.common.cache.CacheBuilderSpec r1, long r2);
    }

    public static class MaximumSizeParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        public MaximumSizeParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        public final void parseLong(com.google.common.cache.CacheBuilderSpec r6, long r7) {
                r5 = this;
                java.lang.Long r0 = r6.maximumSize
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                java.lang.String r4 = "maximum size was already set to "
                com.google.common.base.Preconditions.checkArgument(r3, r4, r0)
                java.lang.Long r0 = r6.maximumWeight
                if (r0 != 0) goto L13
                goto L14
            L13:
                r1 = 0
            L14:
                java.lang.String r2 = "maximum weight was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6.maximumSize = r7
                return
        }
    }

    public static class MaximumWeightParser extends com.google.common.cache.CacheBuilderSpec.LongParser {
        public MaximumWeightParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.LongParser
        public final void parseLong(com.google.common.cache.CacheBuilderSpec r6, long r7) {
                r5 = this;
                java.lang.Long r0 = r6.maximumWeight
                r1 = 1
                r2 = 0
                if (r0 != 0) goto L8
                r3 = 1
                goto L9
            L8:
                r3 = 0
            L9:
                java.lang.String r4 = "maximum weight was already set to "
                com.google.common.base.Preconditions.checkArgument(r3, r4, r0)
                java.lang.Long r0 = r6.maximumSize
                if (r0 != 0) goto L13
                goto L14
            L13:
                r1 = 0
            L14:
                java.lang.String r2 = "maximum size was already set to "
                com.google.common.base.Preconditions.checkArgument(r1, r2, r0)
                java.lang.Long r7 = java.lang.Long.valueOf(r7)
                r6.maximumWeight = r7
                return
        }
    }

    public static class RecordStatsParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        public RecordStatsParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r3, java.lang.String r4, @javax.annotation.CheckForNull java.lang.String r5) {
                r2 = this;
                r4 = 1
                r0 = 0
                if (r5 != 0) goto L6
                r5 = 1
                goto L7
            L6:
                r5 = 0
            L7:
                java.lang.String r1 = "recordStats does not take values"
                com.google.common.base.Preconditions.checkArgument(r5, r1)
                java.lang.Boolean r5 = r3.recordStats
                if (r5 != 0) goto L11
                goto L12
            L11:
                r4 = 0
            L12:
                java.lang.String r5 = "recordStats already set"
                com.google.common.base.Preconditions.checkArgument(r4, r5)
                java.lang.Boolean r4 = java.lang.Boolean.TRUE
                r3.recordStats = r4
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public static class RefreshDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        public RefreshDurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        public final void parseDuration(com.google.common.cache.CacheBuilderSpec r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = r3.refreshTimeUnit
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "refreshAfterWrite already set"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r3.refreshDuration = r4
                r3.refreshTimeUnit = r6
                return
        }
    }

    public interface ValueParser {
        void parse(com.google.common.cache.CacheBuilderSpec r1, java.lang.String r2, @javax.annotation.CheckForNull java.lang.String r3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    public static class ValueStrengthParser implements com.google.common.cache.CacheBuilderSpec.ValueParser {
        private final com.google.common.cache.LocalCache.Strength strength;

        public ValueStrengthParser(com.google.common.cache.LocalCache.Strength r1) {
                r0 = this;
                r0.<init>()
                r0.strength = r1
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.ValueParser
        public void parse(com.google.common.cache.CacheBuilderSpec r4, java.lang.String r5, @javax.annotation.CheckForNull java.lang.String r6) {
                r3 = this;
                r0 = 1
                r1 = 0
                if (r6 != 0) goto L6
                r6 = 1
                goto L7
            L6:
                r6 = 0
            L7:
                java.lang.String r2 = "key %s does not take values"
                com.google.common.base.Preconditions.checkArgument(r6, r2, r5)
                com.google.common.cache.LocalCache$Strength r6 = r4.valueStrength
                if (r6 != 0) goto L11
                goto L12
            L11:
                r0 = 0
            L12:
                java.lang.String r1 = "%s was already set to %s"
                com.google.common.base.Preconditions.checkArgument(r0, r1, r5, r6)
                com.google.common.cache.LocalCache$Strength r5 = r3.strength
                r4.valueStrength = r5
                return
        }
    }

    public static class WriteDurationParser extends com.google.common.cache.CacheBuilderSpec.DurationParser {
        public WriteDurationParser() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // com.google.common.cache.CacheBuilderSpec.DurationParser
        public final void parseDuration(com.google.common.cache.CacheBuilderSpec r3, long r4, java.util.concurrent.TimeUnit r6) {
                r2 = this;
                java.util.concurrent.TimeUnit r0 = r3.writeExpirationTimeUnit
                if (r0 != 0) goto L6
                r0 = 1
                goto L7
            L6:
                r0 = 0
            L7:
                java.lang.String r1 = "expireAfterWrite already set"
                com.google.common.base.Preconditions.checkArgument(r0, r1)
                r3.writeExpirationDuration = r4
                r3.writeExpirationTimeUnit = r6
                return
        }
    }

    static {
            r0 = 44
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r0 = r0.trimResults()
            com.google.common.cache.CacheBuilderSpec.KEYS_SPLITTER = r0
            r0 = 61
            com.google.common.base.Splitter r0 = com.google.common.base.Splitter.on(r0)
            com.google.common.base.Splitter r0 = r0.trimResults()
            com.google.common.cache.CacheBuilderSpec.KEY_VALUE_SPLITTER = r0
            com.google.common.collect.ImmutableMap$Builder r0 = com.google.common.collect.ImmutableMap.builder()
            com.google.common.cache.CacheBuilderSpec$InitialCapacityParser r1 = new com.google.common.cache.CacheBuilderSpec$InitialCapacityParser
            r1.<init>()
            java.lang.String r2 = "initialCapacity"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$MaximumSizeParser r1 = new com.google.common.cache.CacheBuilderSpec$MaximumSizeParser
            r1.<init>()
            java.lang.String r2 = "maximumSize"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$MaximumWeightParser r1 = new com.google.common.cache.CacheBuilderSpec$MaximumWeightParser
            r1.<init>()
            java.lang.String r2 = "maximumWeight"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$ConcurrencyLevelParser r1 = new com.google.common.cache.CacheBuilderSpec$ConcurrencyLevelParser
            r1.<init>()
            java.lang.String r2 = "concurrencyLevel"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$KeyStrengthParser r1 = new com.google.common.cache.CacheBuilderSpec$KeyStrengthParser
            com.google.common.cache.LocalCache$Strength r2 = com.google.common.cache.LocalCache.Strength.WEAK
            r1.<init>(r2)
            java.lang.String r3 = "weakKeys"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r3, r1)
            com.google.common.cache.CacheBuilderSpec$ValueStrengthParser r1 = new com.google.common.cache.CacheBuilderSpec$ValueStrengthParser
            com.google.common.cache.LocalCache$Strength r3 = com.google.common.cache.LocalCache.Strength.SOFT
            r1.<init>(r3)
            java.lang.String r3 = "softValues"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r3, r1)
            com.google.common.cache.CacheBuilderSpec$ValueStrengthParser r1 = new com.google.common.cache.CacheBuilderSpec$ValueStrengthParser
            r1.<init>(r2)
            java.lang.String r2 = "weakValues"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$RecordStatsParser r1 = new com.google.common.cache.CacheBuilderSpec$RecordStatsParser
            r1.<init>()
            java.lang.String r2 = "recordStats"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$AccessDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$AccessDurationParser
            r1.<init>()
            java.lang.String r2 = "expireAfterAccess"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$WriteDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$WriteDurationParser
            r1.<init>()
            java.lang.String r2 = "expireAfterWrite"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$RefreshDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$RefreshDurationParser
            r1.<init>()
            java.lang.String r2 = "refreshAfterWrite"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.cache.CacheBuilderSpec$RefreshDurationParser r1 = new com.google.common.cache.CacheBuilderSpec$RefreshDurationParser
            r1.<init>()
            java.lang.String r2 = "refreshInterval"
            com.google.common.collect.ImmutableMap$Builder r0 = r0.put(r2, r1)
            com.google.common.collect.ImmutableMap r0 = r0.build()
            com.google.common.cache.CacheBuilderSpec.VALUE_PARSERS = r0
            return
    }

    private CacheBuilderSpec(java.lang.String r1) {
            r0 = this;
            r0.<init>()
            r0.specification = r1
            return
    }

    public static /* synthetic */ java.lang.String access$000(java.lang.String r0, java.lang.Object[] r1) {
            java.lang.String r0 = format(r0, r1)
            return r0
    }

    public static com.google.common.cache.CacheBuilderSpec disableCaching() {
            java.lang.String r0 = "maximumSize=0"
            com.google.common.cache.CacheBuilderSpec r0 = parse(r0)
            return r0
    }

    @javax.annotation.CheckForNull
    private static java.lang.Long durationInNanos(long r0, @javax.annotation.CheckForNull java.util.concurrent.TimeUnit r2) {
            if (r2 != 0) goto L4
            r0 = 0
            goto Lc
        L4:
            long r0 = r2.toNanos(r0)
            java.lang.Long r0 = java.lang.Long.valueOf(r0)
        Lc:
            return r0
    }

    private static java.lang.String format(java.lang.String r1, java.lang.Object... r2) {
            java.util.Locale r0 = java.util.Locale.ROOT
            java.lang.String r1 = java.lang.String.format(r0, r1, r2)
            return r1
    }

    public static com.google.common.cache.CacheBuilderSpec parse(java.lang.String r7) {
            com.google.common.cache.CacheBuilderSpec r0 = new com.google.common.cache.CacheBuilderSpec
            r0.<init>(r7)
            boolean r1 = r7.isEmpty()
            if (r1 != 0) goto L6f
            com.google.common.base.Splitter r1 = com.google.common.cache.CacheBuilderSpec.KEYS_SPLITTER
            java.lang.Iterable r7 = r1.split(r7)
            java.util.Iterator r7 = r7.iterator()
        L15:
            boolean r1 = r7.hasNext()
            if (r1 == 0) goto L6f
            java.lang.Object r1 = r7.next()
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.base.Splitter r2 = com.google.common.cache.CacheBuilderSpec.KEY_VALUE_SPLITTER
            java.lang.Iterable r2 = r2.split(r1)
            com.google.common.collect.ImmutableList r2 = com.google.common.collect.ImmutableList.copyOf(r2)
            boolean r3 = r2.isEmpty()
            r4 = 1
            r3 = r3 ^ r4
            java.lang.String r5 = "blank key-value pair"
            com.google.common.base.Preconditions.checkArgument(r3, r5)
            int r3 = r2.size()
            r5 = 2
            r6 = 0
            if (r3 > r5) goto L40
            r3 = 1
            goto L41
        L40:
            r3 = 0
        L41:
            java.lang.String r5 = "key-value pair %s with more than one equals sign"
            com.google.common.base.Preconditions.checkArgument(r3, r5, r1)
            java.lang.Object r1 = r2.get(r6)
            java.lang.String r1 = (java.lang.String) r1
            com.google.common.collect.ImmutableMap<java.lang.String, com.google.common.cache.CacheBuilderSpec$ValueParser> r3 = com.google.common.cache.CacheBuilderSpec.VALUE_PARSERS
            java.lang.Object r3 = r3.get(r1)
            com.google.common.cache.CacheBuilderSpec$ValueParser r3 = (com.google.common.cache.CacheBuilderSpec.ValueParser) r3
            if (r3 == 0) goto L57
            r6 = 1
        L57:
            java.lang.String r5 = "unknown key %s"
            com.google.common.base.Preconditions.checkArgument(r6, r5, r1)
            int r5 = r2.size()
            if (r5 != r4) goto L65
            r2 = 0
            goto L6b
        L65:
            java.lang.Object r2 = r2.get(r4)
            java.lang.String r2 = (java.lang.String) r2
        L6b:
            r3.parse(r0, r1, r2)
            goto L15
        L6f:
            return r0
    }

    public boolean equals(@javax.annotation.CheckForNull java.lang.Object r7) {
            r6 = this;
            r0 = 1
            if (r6 != r7) goto L4
            return r0
        L4:
            boolean r1 = r7 instanceof com.google.common.cache.CacheBuilderSpec
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            com.google.common.cache.CacheBuilderSpec r7 = (com.google.common.cache.CacheBuilderSpec) r7
            java.lang.Integer r1 = r6.initialCapacity
            java.lang.Integer r3 = r7.initialCapacity
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Long r1 = r6.maximumSize
            java.lang.Long r3 = r7.maximumSize
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Long r1 = r6.maximumWeight
            java.lang.Long r3 = r7.maximumWeight
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Integer r1 = r6.concurrencyLevel
            java.lang.Integer r3 = r7.concurrencyLevel
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            com.google.common.cache.LocalCache$Strength r1 = r6.keyStrength
            com.google.common.cache.LocalCache$Strength r3 = r7.keyStrength
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            com.google.common.cache.LocalCache$Strength r1 = r6.valueStrength
            com.google.common.cache.LocalCache$Strength r3 = r7.valueStrength
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            java.lang.Boolean r1 = r6.recordStats
            java.lang.Boolean r3 = r7.recordStats
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            long r3 = r6.writeExpirationDuration
            java.util.concurrent.TimeUnit r1 = r6.writeExpirationTimeUnit
            java.lang.Long r1 = durationInNanos(r3, r1)
            long r3 = r7.writeExpirationDuration
            java.util.concurrent.TimeUnit r5 = r7.writeExpirationTimeUnit
            java.lang.Long r3 = durationInNanos(r3, r5)
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            long r3 = r6.accessExpirationDuration
            java.util.concurrent.TimeUnit r1 = r6.accessExpirationTimeUnit
            java.lang.Long r1 = durationInNanos(r3, r1)
            long r3 = r7.accessExpirationDuration
            java.util.concurrent.TimeUnit r5 = r7.accessExpirationTimeUnit
            java.lang.Long r3 = durationInNanos(r3, r5)
            boolean r1 = com.google.common.base.Objects.equal(r1, r3)
            if (r1 == 0) goto L95
            long r3 = r6.refreshDuration
            java.util.concurrent.TimeUnit r1 = r6.refreshTimeUnit
            java.lang.Long r1 = durationInNanos(r3, r1)
            long r3 = r7.refreshDuration
            java.util.concurrent.TimeUnit r7 = r7.refreshTimeUnit
            java.lang.Long r7 = durationInNanos(r3, r7)
            boolean r7 = com.google.common.base.Objects.equal(r1, r7)
            if (r7 == 0) goto L95
            goto L96
        L95:
            r0 = 0
        L96:
            return r0
    }

    public int hashCode() {
            r4 = this;
            r0 = 10
            java.lang.Object[] r0 = new java.lang.Object[r0]
            java.lang.Integer r1 = r4.initialCapacity
            r2 = 0
            r0[r2] = r1
            java.lang.Long r1 = r4.maximumSize
            r2 = 1
            r0[r2] = r1
            java.lang.Long r1 = r4.maximumWeight
            r2 = 2
            r0[r2] = r1
            java.lang.Integer r1 = r4.concurrencyLevel
            r2 = 3
            r0[r2] = r1
            com.google.common.cache.LocalCache$Strength r1 = r4.keyStrength
            r2 = 4
            r0[r2] = r1
            com.google.common.cache.LocalCache$Strength r1 = r4.valueStrength
            r2 = 5
            r0[r2] = r1
            java.lang.Boolean r1 = r4.recordStats
            r2 = 6
            r0[r2] = r1
            long r1 = r4.writeExpirationDuration
            java.util.concurrent.TimeUnit r3 = r4.writeExpirationTimeUnit
            java.lang.Long r1 = durationInNanos(r1, r3)
            r2 = 7
            r0[r2] = r1
            long r1 = r4.accessExpirationDuration
            java.util.concurrent.TimeUnit r3 = r4.accessExpirationTimeUnit
            java.lang.Long r1 = durationInNanos(r1, r3)
            r2 = 8
            r0[r2] = r1
            long r1 = r4.refreshDuration
            java.util.concurrent.TimeUnit r3 = r4.refreshTimeUnit
            java.lang.Long r1 = durationInNanos(r1, r3)
            r2 = 9
            r0[r2] = r1
            int r0 = com.google.common.base.Objects.hashCode(r0)
            return r0
    }

    public java.lang.String toParsableString() {
            r1 = this;
            java.lang.String r0 = r1.specification
            return r0
    }

    public java.lang.String toString() {
            r2 = this;
            com.google.common.base.MoreObjects$ToStringHelper r0 = com.google.common.base.MoreObjects.toStringHelper(r2)
            java.lang.String r1 = r2.toParsableString()
            com.google.common.base.MoreObjects$ToStringHelper r0 = r0.addValue(r1)
            java.lang.String r0 = r0.toString()
            return r0
    }
}
