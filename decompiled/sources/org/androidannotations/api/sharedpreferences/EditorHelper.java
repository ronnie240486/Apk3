package org.androidannotations.api.sharedpreferences;

import org.androidannotations.api.sharedpreferences.EditorHelper;

/* JADX INFO: loaded from: classes3.dex */
public abstract class EditorHelper<T extends org.androidannotations.api.sharedpreferences.EditorHelper<T>> {
    private final android.content.SharedPreferences.Editor editor;

    public EditorHelper(android.content.SharedPreferences r1) {
            r0 = this;
            r0.<init>()
            android.content.SharedPreferences$Editor r1 = r1.edit()
            r0.editor = r1
            return
    }

    private T cast() {
            r0 = this;
            return r0
    }

    public final void apply() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.editor
            org.androidannotations.api.sharedpreferences.SharedPreferencesCompat.apply(r0)
            return
    }

    public final T clear() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.editor
            r0.clear()
            org.androidannotations.api.sharedpreferences.EditorHelper r0 = r1.cast()
            return r0
    }

    public final android.content.SharedPreferences.Editor getEditor() {
            r1 = this;
            android.content.SharedPreferences$Editor r0 = r1.editor
            return r0
    }
}
