package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public class Person {
    private static final java.lang.String ICON_KEY = "icon";
    private static final java.lang.String IS_BOT_KEY = "isBot";
    private static final java.lang.String IS_IMPORTANT_KEY = "isImportant";
    private static final java.lang.String KEY_KEY = "key";
    private static final java.lang.String NAME_KEY = "name";
    private static final java.lang.String URI_KEY = "uri";

    @androidx.annotation.Nullable
    public androidx.core.graphics.drawable.IconCompat mIcon;
    public boolean mIsBot;
    public boolean mIsImportant;

    @androidx.annotation.Nullable
    public java.lang.String mKey;

    @androidx.annotation.Nullable
    public java.lang.CharSequence mName;

    @androidx.annotation.Nullable
    public java.lang.String mUri;

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(22)
    public static class Api22Impl {
        private Api22Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static androidx.core.app.Person fromPersistableBundle(android.os.PersistableBundle r2) {
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                java.lang.String r1 = "name"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setName(r1)
                java.lang.String r1 = "uri"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = "key"
                java.lang.String r1 = r2.getString(r1)
                androidx.core.app.Person$Builder r0 = r0.setKey(r1)
                java.lang.String r1 = "isBot"
                boolean r1 = r2.getBoolean(r1)
                androidx.core.app.Person$Builder r0 = r0.setBot(r1)
                java.lang.String r1 = "isImportant"
                boolean r2 = r2.getBoolean(r1)
                androidx.core.app.Person$Builder r2 = r0.setImportant(r2)
                androidx.core.app.Person r2 = r2.build()
                return r2
        }

        @androidx.annotation.DoNotInline
        public static android.os.PersistableBundle toPersistableBundle(androidx.core.app.Person r3) {
                android.os.PersistableBundle r0 = new android.os.PersistableBundle
                r0.<init>()
                java.lang.CharSequence r1 = r3.mName
                if (r1 == 0) goto Le
                java.lang.String r1 = r1.toString()
                goto Lf
            Le:
                r1 = 0
            Lf:
                java.lang.String r2 = "name"
                r0.putString(r2, r1)
                java.lang.String r1 = r3.mUri
                java.lang.String r2 = "uri"
                r0.putString(r2, r1)
                java.lang.String r1 = r3.mKey
                java.lang.String r2 = "key"
                r0.putString(r2, r1)
                boolean r1 = r3.mIsBot
                java.lang.String r2 = "isBot"
                r0.putBoolean(r2, r1)
                boolean r3 = r3.mIsImportant
                java.lang.String r1 = "isImportant"
                r0.putBoolean(r1, r3)
                return r0
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    @androidx.annotation.RequiresApi(28)
    public static class Api28Impl {
        private Api28Impl() {
                r0 = this;
                r0.<init>()
                return
        }

        @androidx.annotation.DoNotInline
        public static androidx.core.app.Person fromAndroidPerson(android.app.Person r2) {
                androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
                r0.<init>()
                java.lang.CharSequence r1 = r2.getName()
                androidx.core.app.Person$Builder r0 = r0.setName(r1)
                android.graphics.drawable.Icon r1 = r2.getIcon()
                if (r1 == 0) goto L1c
                android.graphics.drawable.Icon r1 = r2.getIcon()
                androidx.core.graphics.drawable.IconCompat r1 = androidx.core.graphics.drawable.IconCompat.createFromIcon(r1)
                goto L1d
            L1c:
                r1 = 0
            L1d:
                androidx.core.app.Person$Builder r0 = r0.setIcon(r1)
                java.lang.String r1 = r2.getUri()
                androidx.core.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = r2.getKey()
                androidx.core.app.Person$Builder r0 = r0.setKey(r1)
                boolean r1 = r2.isBot()
                androidx.core.app.Person$Builder r0 = r0.setBot(r1)
                boolean r2 = r2.isImportant()
                androidx.core.app.Person$Builder r2 = r0.setImportant(r2)
                androidx.core.app.Person r2 = r2.build()
                return r2
        }

        @androidx.annotation.DoNotInline
        public static android.app.Person toAndroidPerson(androidx.core.app.Person r2) {
                android.app.Person$Builder r0 = new android.app.Person$Builder
                r0.<init>()
                java.lang.CharSequence r1 = r2.getName()
                android.app.Person$Builder r0 = r0.setName(r1)
                androidx.core.graphics.drawable.IconCompat r1 = r2.getIcon()
                if (r1 == 0) goto L1c
                androidx.core.graphics.drawable.IconCompat r1 = r2.getIcon()
                android.graphics.drawable.Icon r1 = r1.toIcon()
                goto L1d
            L1c:
                r1 = 0
            L1d:
                android.app.Person$Builder r0 = r0.setIcon(r1)
                java.lang.String r1 = r2.getUri()
                android.app.Person$Builder r0 = r0.setUri(r1)
                java.lang.String r1 = r2.getKey()
                android.app.Person$Builder r0 = r0.setKey(r1)
                boolean r1 = r2.isBot()
                android.app.Person$Builder r0 = r0.setBot(r1)
                boolean r2 = r2.isImportant()
                android.app.Person$Builder r2 = r0.setImportant(r2)
                android.app.Person r2 = r2.build()
                return r2
        }
    }

    /* JADX INFO: loaded from: classes.dex */
    public static class Builder {

        @androidx.annotation.Nullable
        public androidx.core.graphics.drawable.IconCompat mIcon;
        public boolean mIsBot;
        public boolean mIsImportant;

        @androidx.annotation.Nullable
        public java.lang.String mKey;

        @androidx.annotation.Nullable
        public java.lang.CharSequence mName;

        @androidx.annotation.Nullable
        public java.lang.String mUri;

        public Builder() {
                r0 = this;
                r0.<init>()
                return
        }

        public Builder(androidx.core.app.Person r2) {
                r1 = this;
                r1.<init>()
                java.lang.CharSequence r0 = r2.mName
                r1.mName = r0
                androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
                r1.mIcon = r0
                java.lang.String r0 = r2.mUri
                r1.mUri = r0
                java.lang.String r0 = r2.mKey
                r1.mKey = r0
                boolean r0 = r2.mIsBot
                r1.mIsBot = r0
                boolean r2 = r2.mIsImportant
                r1.mIsImportant = r2
                return
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person build() {
                r1 = this;
                androidx.core.app.Person r0 = new androidx.core.app.Person
                r0.<init>(r1)
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person.Builder setBot(boolean r1) {
                r0 = this;
                r0.mIsBot = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person.Builder setIcon(@androidx.annotation.Nullable androidx.core.graphics.drawable.IconCompat r1) {
                r0 = this;
                r0.mIcon = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person.Builder setImportant(boolean r1) {
                r0 = this;
                r0.mIsImportant = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person.Builder setKey(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mKey = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person.Builder setName(@androidx.annotation.Nullable java.lang.CharSequence r1) {
                r0 = this;
                r0.mName = r1
                return r0
        }

        @androidx.annotation.NonNull
        public androidx.core.app.Person.Builder setUri(@androidx.annotation.Nullable java.lang.String r1) {
                r0 = this;
                r0.mUri = r1
                return r0
        }
    }

    public Person(androidx.core.app.Person.Builder r2) {
            r1 = this;
            r1.<init>()
            java.lang.CharSequence r0 = r2.mName
            r1.mName = r0
            androidx.core.graphics.drawable.IconCompat r0 = r2.mIcon
            r1.mIcon = r0
            java.lang.String r0 = r2.mUri
            r1.mUri = r0
            java.lang.String r0 = r2.mKey
            r1.mKey = r0
            boolean r0 = r2.mIsBot
            r1.mIsBot = r0
            boolean r2 = r2.mIsImportant
            r1.mIsImportant = r2
            return
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(28)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.app.Person fromAndroidPerson(@androidx.annotation.NonNull android.app.Person r0) {
            androidx.core.app.Person r0 = androidx.core.app.Person.Api28Impl.fromAndroidPerson(r0)
            return r0
    }

    @androidx.annotation.NonNull
    public static androidx.core.app.Person fromBundle(@androidx.annotation.NonNull android.os.Bundle r3) {
            java.lang.String r0 = "icon"
            android.os.Bundle r0 = r3.getBundle(r0)
            androidx.core.app.Person$Builder r1 = new androidx.core.app.Person$Builder
            r1.<init>()
            java.lang.String r2 = "name"
            java.lang.CharSequence r2 = r3.getCharSequence(r2)
            androidx.core.app.Person$Builder r1 = r1.setName(r2)
            if (r0 == 0) goto L1c
            androidx.core.graphics.drawable.IconCompat r0 = androidx.core.graphics.drawable.IconCompat.createFromBundle(r0)
            goto L1d
        L1c:
            r0 = 0
        L1d:
            androidx.core.app.Person$Builder r0 = r1.setIcon(r0)
            java.lang.String r1 = "uri"
            java.lang.String r1 = r3.getString(r1)
            androidx.core.app.Person$Builder r0 = r0.setUri(r1)
            java.lang.String r1 = "key"
            java.lang.String r1 = r3.getString(r1)
            androidx.core.app.Person$Builder r0 = r0.setKey(r1)
            java.lang.String r1 = "isBot"
            boolean r1 = r3.getBoolean(r1)
            androidx.core.app.Person$Builder r0 = r0.setBot(r1)
            java.lang.String r1 = "isImportant"
            boolean r3 = r3.getBoolean(r1)
            androidx.core.app.Person$Builder r3 = r0.setImportant(r3)
            androidx.core.app.Person r3 = r3.build()
            return r3
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(22)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public static androidx.core.app.Person fromPersistableBundle(@androidx.annotation.NonNull android.os.PersistableBundle r0) {
            androidx.core.app.Person r0 = androidx.core.app.Person.Api22Impl.fromPersistableBundle(r0)
            return r0
    }

    @androidx.annotation.Nullable
    public androidx.core.graphics.drawable.IconCompat getIcon() {
            r1 = this;
            androidx.core.graphics.drawable.IconCompat r0 = r1.mIcon
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getKey() {
            r1 = this;
            java.lang.String r0 = r1.mKey
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.CharSequence getName() {
            r1 = this;
            java.lang.CharSequence r0 = r1.mName
            return r0
    }

    @androidx.annotation.Nullable
    public java.lang.String getUri() {
            r1 = this;
            java.lang.String r0 = r1.mUri
            return r0
    }

    public boolean isBot() {
            r1 = this;
            boolean r0 = r1.mIsBot
            return r0
    }

    public boolean isImportant() {
            r1 = this;
            boolean r0 = r1.mIsImportant
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public java.lang.String resolveToLegacyUri() {
            r2 = this;
            java.lang.String r0 = r2.mUri
            if (r0 == 0) goto L5
            return r0
        L5:
            java.lang.CharSequence r0 = r2.mName
            if (r0 == 0) goto L19
            java.lang.String r0 = "name:"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            java.lang.CharSequence r1 = r2.mName
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            return r0
        L19:
            java.lang.String r0 = ""
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(28)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.app.Person toAndroidPerson() {
            r1 = this;
            android.app.Person r0 = androidx.core.app.Person.Api28Impl.toAndroidPerson(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.core.app.Person.Builder toBuilder() {
            r1 = this;
            androidx.core.app.Person$Builder r0 = new androidx.core.app.Person$Builder
            r0.<init>(r1)
            return r0
    }

    @androidx.annotation.NonNull
    public android.os.Bundle toBundle() {
            r3 = this;
            android.os.Bundle r0 = new android.os.Bundle
            r0.<init>()
            java.lang.CharSequence r1 = r3.mName
            java.lang.String r2 = "name"
            r0.putCharSequence(r2, r1)
            androidx.core.graphics.drawable.IconCompat r1 = r3.mIcon
            if (r1 == 0) goto L15
            android.os.Bundle r1 = r1.toBundle()
            goto L16
        L15:
            r1 = 0
        L16:
            java.lang.String r2 = "icon"
            r0.putBundle(r2, r1)
            java.lang.String r1 = r3.mUri
            java.lang.String r2 = "uri"
            r0.putString(r2, r1)
            java.lang.String r1 = r3.mKey
            java.lang.String r2 = "key"
            r0.putString(r2, r1)
            boolean r1 = r3.mIsBot
            java.lang.String r2 = "isBot"
            r0.putBoolean(r2, r1)
            boolean r1 = r3.mIsImportant
            java.lang.String r2 = "isImportant"
            r0.putBoolean(r2, r1)
            return r0
    }

    @androidx.annotation.NonNull
    @androidx.annotation.RequiresApi(22)
    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX})
    public android.os.PersistableBundle toPersistableBundle() {
            r1 = this;
            android.os.PersistableBundle r0 = androidx.core.app.Person.Api22Impl.toPersistableBundle(r1)
            return r0
    }
}
