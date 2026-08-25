package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.EditorHelper;

/* JADX INFO: loaded from: classes.dex */
public final class StringSetPrefEditorField<T extends org.androidannotations.api.sharedpreferences.EditorHelper<T>> extends org.androidannotations.api.sharedpreferences.AbstractPrefEditorField<T> {
    public T put(java.util.Set<java.lang.String> r3) {
            r2 = this;
            T extends org.androidannotations.api.sharedpreferences.EditorHelper<T> r0 = r2.editorHelper
            android.content.SharedPreferences$Editor r0 = r0.getEditor()
            java.lang.String r1 = r2.key
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.putStringSet(r0, r1, r3)
            T extends org.androidannotations.api.sharedpreferences.EditorHelper<T> r3 = r2.editorHelper
            return r3
    }
}
