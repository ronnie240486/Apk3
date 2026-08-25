package com.bumptech.glide.load.data;

/* JADX INFO: loaded from: classes.dex */
public class StreamLocalUriFetcher extends com.bumptech.glide.load.data.LocalUriFetcher<java.io.InputStream> {
    private static final int ID_CONTACTS_CONTACT = 3;
    private static final int ID_CONTACTS_LOOKUP = 1;
    private static final int ID_CONTACTS_PHOTO = 4;
    private static final int ID_CONTACTS_THUMBNAIL = 2;
    private static final int ID_LOOKUP_BY_PHONE = 5;
    private static final android.content.UriMatcher URI_MATCHER = null;

    static {
            android.content.UriMatcher r0 = new android.content.UriMatcher
            r1 = -1
            r0.<init>(r1)
            com.bumptech.glide.load.data.StreamLocalUriFetcher.URI_MATCHER = r0
            java.lang.String r1 = "com.android.contacts"
            java.lang.String r2 = "contacts/lookup/*/#"
            r3 = 1
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/lookup/*"
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/photo"
            r3 = 2
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#"
            r3 = 3
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "contacts/#/display_photo"
            r3 = 4
            r0.addURI(r1, r2, r3)
            java.lang.String r2 = "phone_lookup/*"
            r3 = 5
            r0.addURI(r1, r2, r3)
            return
    }

    public StreamLocalUriFetcher(android.content.ContentResolver r1, android.net.Uri r2) {
            r0 = this;
            r0.<init>(r1, r2)
            return
    }

    private java.io.InputStream loadResourceFromUri(android.net.Uri r3, android.content.ContentResolver r4) throws java.io.FileNotFoundException {
            r2 = this;
            android.content.UriMatcher r0 = com.bumptech.glide.load.data.StreamLocalUriFetcher.URI_MATCHER
            int r0 = r0.match(r3)
            r1 = 1
            if (r0 == r1) goto L19
            r1 = 3
            if (r0 == r1) goto L14
            r1 = 5
            if (r0 == r1) goto L19
            java.io.InputStream r3 = r4.openInputStream(r3)
            return r3
        L14:
            java.io.InputStream r3 = r2.openContactPhotoInputStream(r4, r3)
            return r3
        L19:
            android.net.Uri r3 = android.provider.ContactsContract.Contacts.lookupContact(r4, r3)
            if (r3 == 0) goto L24
            java.io.InputStream r3 = r2.openContactPhotoInputStream(r4, r3)
            return r3
        L24:
            java.io.FileNotFoundException r3 = new java.io.FileNotFoundException
            java.lang.String r4 = "Contact cannot be found"
            r3.<init>(r4)
            throw r3
    }

    private java.io.InputStream openContactPhotoInputStream(android.content.ContentResolver r2, android.net.Uri r3) {
            r1 = this;
            r0 = 1
            java.io.InputStream r2 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r2, r3, r0)
            return r2
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final void close(java.io.InputStream r1) throws java.io.IOException {
            r0 = this;
            java.io.InputStream r1 = (java.io.InputStream) r1
            r1.close()
            return
    }

    @Override // com.bumptech.glide.load.data.DataFetcher
    @androidx.annotation.NonNull
    public java.lang.Class<java.io.InputStream> getDataClass() {
            r1 = this;
            java.lang.Class<java.io.InputStream> r0 = java.io.InputStream.class
            return r0
    }

    @Override // com.bumptech.glide.load.data.LocalUriFetcher
    public final java.io.InputStream loadResource(android.net.Uri r3, android.content.ContentResolver r4) throws java.io.FileNotFoundException {
            r2 = this;
            java.io.InputStream r4 = r2.loadResourceFromUri(r3, r4)
            if (r4 == 0) goto L7
            return r4
        L7:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "InputStream is null for "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            r4.<init>(r3)
            throw r4
    }
}
