package androidx.emoji2.text;

/* JADX INFO: loaded from: classes2.dex */
public final class DefaultEmojiCompatConfig {

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigFactory {

        @androidx.annotation.NonNull
        private static final java.lang.String DEFAULT_EMOJI_QUERY = "emojicompat-emoji-font";

        @androidx.annotation.NonNull
        private static final java.lang.String INTENT_LOAD_EMOJI_FONT = "androidx.content.action.LOAD_EMOJI_FONT";

        @androidx.annotation.NonNull
        private static final java.lang.String TAG = "emoji2.text.DefaultEmojiConfig";
        private final androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper mHelper;

        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public DefaultEmojiCompatConfigFactory(@androidx.annotation.Nullable androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper r1) {
                r0 = this;
                r0.<init>()
                if (r1 == 0) goto L6
                goto La
            L6:
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r1 = getHelperForApi()
            La:
                r0.mHelper = r1
                return
        }

        @androidx.annotation.Nullable
        private androidx.emoji2.text.EmojiCompat.Config configOrNull(@androidx.annotation.NonNull android.content.Context r2, @androidx.annotation.Nullable androidx.core.provider.FontRequest r3) {
                r1 = this;
                if (r3 != 0) goto L4
                r2 = 0
                return r2
            L4:
                androidx.emoji2.text.FontRequestEmojiCompatConfig r0 = new androidx.emoji2.text.FontRequestEmojiCompatConfig
                r0.<init>(r2, r3)
                return r0
        }

        @androidx.annotation.NonNull
        private java.util.List<java.util.List<byte[]>> convertToByteArray(@androidx.annotation.NonNull android.content.pm.Signature[] r5) {
                r4 = this;
                java.util.ArrayList r0 = new java.util.ArrayList
                r0.<init>()
                int r1 = r5.length
                r2 = 0
            L7:
                if (r2 >= r1) goto L15
                r3 = r5[r2]
                byte[] r3 = r3.toByteArray()
                r0.add(r3)
                int r2 = r2 + 1
                goto L7
            L15:
                java.util.List r5 = java.util.Collections.singletonList(r0)
                return r5
        }

        @androidx.annotation.NonNull
        private androidx.core.provider.FontRequest generateFontRequestFrom(@androidx.annotation.NonNull android.content.pm.ProviderInfo r4, @androidx.annotation.NonNull android.content.pm.PackageManager r5) throws android.content.pm.PackageManager.NameNotFoundException {
                r3 = this;
                java.lang.String r0 = r4.authority
                java.lang.String r4 = r4.packageName
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r1 = r3.mHelper
                android.content.pm.Signature[] r5 = r1.getSigningSignatures(r5, r4)
                java.util.List r5 = r3.convertToByteArray(r5)
                androidx.core.provider.FontRequest r1 = new androidx.core.provider.FontRequest
                java.lang.String r2 = "emojicompat-emoji-font"
                r1.<init>(r0, r4, r2, r5)
                return r1
        }

        @androidx.annotation.NonNull
        private static androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper getHelperForApi() {
                int r0 = android.os.Build.VERSION.SDK_INT
                r1 = 28
                if (r0 < r1) goto Lc
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28 r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API28
                r0.<init>()
                return r0
            Lc:
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API19 r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper_API19
                r0.<init>()
                return r0
        }

        private boolean hasFlagSystem(@androidx.annotation.Nullable android.content.pm.ProviderInfo r2) {
                r1 = this;
                r0 = 1
                if (r2 == 0) goto Ld
                android.content.pm.ApplicationInfo r2 = r2.applicationInfo
                if (r2 == 0) goto Ld
                int r2 = r2.flags
                r2 = r2 & r0
                if (r2 != r0) goto Ld
                goto Le
            Ld:
                r0 = 0
            Le:
                return r0
        }

        @androidx.annotation.Nullable
        private android.content.pm.ProviderInfo queryDefaultInstalledContentProvider(@androidx.annotation.NonNull android.content.pm.PackageManager r4) {
                r3 = this;
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r0 = r3.mHelper
                android.content.Intent r1 = new android.content.Intent
                java.lang.String r2 = "androidx.content.action.LOAD_EMOJI_FONT"
                r1.<init>(r2)
                r2 = 0
                java.util.List r4 = r0.queryIntentContentProviders(r4, r1, r2)
                java.util.Iterator r4 = r4.iterator()
            L12:
                boolean r0 = r4.hasNext()
                if (r0 == 0) goto L2b
                java.lang.Object r0 = r4.next()
                android.content.pm.ResolveInfo r0 = (android.content.pm.ResolveInfo) r0
                androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigHelper r1 = r3.mHelper
                android.content.pm.ProviderInfo r0 = r1.getProviderInfo(r0)
                boolean r1 = r3.hasFlagSystem(r0)
                if (r1 == 0) goto L12
                return r0
            L2b:
                r4 = 0
                return r4
        }

        @androidx.annotation.Nullable
        @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
        public androidx.emoji2.text.EmojiCompat.Config create(@androidx.annotation.NonNull android.content.Context r4) {
                r3 = this;
                android.content.pm.PackageManager r0 = r4.getPackageManager()
                java.lang.String r1 = "Package manager required to locate emoji font provider"
                androidx.core.util.Preconditions.checkNotNull(r0, r1)
                android.content.pm.ProviderInfo r1 = r3.queryDefaultInstalledContentProvider(r0)
                r2 = 0
                if (r1 != 0) goto L11
                goto L1c
            L11:
                androidx.core.provider.FontRequest r2 = r3.generateFontRequestFrom(r1, r0)     // Catch: android.content.pm.PackageManager.NameNotFoundException -> L16
                goto L1c
            L16:
                r0 = move-exception
                java.lang.String r1 = "emoji2.text.DefaultEmojiConfig"
                android.util.Log.wtf(r1, r0)
            L1c:
                androidx.emoji2.text.EmojiCompat$Config r4 = r3.configOrNull(r4, r2)
                return r4
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper {
        public DefaultEmojiCompatConfigHelper() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.Nullable
        public android.content.pm.ProviderInfo getProviderInfo(@androidx.annotation.NonNull android.content.pm.ResolveInfo r2) {
                r1 = this;
                java.lang.IllegalStateException r2 = new java.lang.IllegalStateException
                java.lang.String r0 = "Unable to get provider info prior to API 19"
                r2.<init>(r0)
                throw r2
        }

        @androidx.annotation.NonNull
        public android.content.pm.Signature[] getSigningSignatures(@androidx.annotation.NonNull android.content.pm.PackageManager r2, @androidx.annotation.NonNull java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 64
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                android.content.pm.Signature[] r2 = r2.signatures
                return r2
        }

        @androidx.annotation.NonNull
        public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(@androidx.annotation.NonNull android.content.pm.PackageManager r1, @androidx.annotation.NonNull android.content.Intent r2, int r3) {
                r0 = this;
                java.util.List r1 = java.util.Collections.emptyList()
                return r1
        }
    }

    @androidx.annotation.RequiresApi(19)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper_API19 extends androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper {
        public DefaultEmojiCompatConfigHelper_API19() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @androidx.annotation.Nullable
        public android.content.pm.ProviderInfo getProviderInfo(@androidx.annotation.NonNull android.content.pm.ResolveInfo r1) {
                r0 = this;
                android.content.pm.ProviderInfo r1 = r1.providerInfo
                return r1
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @androidx.annotation.NonNull
        public java.util.List<android.content.pm.ResolveInfo> queryIntentContentProviders(@androidx.annotation.NonNull android.content.pm.PackageManager r1, @androidx.annotation.NonNull android.content.Intent r2, int r3) {
                r0 = this;
                java.util.List r1 = r1.queryIntentContentProviders(r2, r3)
                return r1
        }
    }

    @androidx.annotation.RequiresApi(28)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY})
    public static class DefaultEmojiCompatConfigHelper_API28 extends androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper_API19 {
        public DefaultEmojiCompatConfigHelper_API28() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.emoji2.text.DefaultEmojiCompatConfig.DefaultEmojiCompatConfigHelper
        @androidx.annotation.NonNull
        public android.content.pm.Signature[] getSigningSignatures(@androidx.annotation.NonNull android.content.pm.PackageManager r2, @androidx.annotation.NonNull java.lang.String r3) throws android.content.pm.PackageManager.NameNotFoundException {
                r1 = this;
                r0 = 64
                android.content.pm.PackageInfo r2 = r2.getPackageInfo(r3, r0)
                android.content.pm.Signature[] r2 = r2.signatures
                return r2
        }
    }

    private DefaultEmojiCompatConfig() {
            r0 = this;
            r0.<init>()
            return
    }

    @androidx.annotation.Nullable
    public static androidx.emoji2.text.FontRequestEmojiCompatConfig create(@androidx.annotation.NonNull android.content.Context r2) {
            androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory r0 = new androidx.emoji2.text.DefaultEmojiCompatConfig$DefaultEmojiCompatConfigFactory
            r1 = 0
            r0.<init>(r1)
            androidx.emoji2.text.EmojiCompat$Config r2 = r0.create(r2)
            androidx.emoji2.text.FontRequestEmojiCompatConfig r2 = (androidx.emoji2.text.FontRequestEmojiCompatConfig) r2
            return r2
    }
}
