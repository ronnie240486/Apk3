package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
public class GuidedStepSupportFragment extends androidx.fragment.app.Fragment implements androidx.leanback.widget.GuidedActionAdapter.FocusListener {
    private static final boolean DEBUG = false;
    private static final java.lang.String ENTRY_NAME_ENTRANCE = "GuidedStepEntrance";
    private static final java.lang.String ENTRY_NAME_REPLACE = "GuidedStepDefault";
    private static final java.lang.String EXTRA_ACTION_PREFIX = "action_";
    private static final java.lang.String EXTRA_BUTTON_ACTION_PREFIX = "buttonaction_";
    public static final java.lang.String EXTRA_UI_STYLE = "uiStyle";
    private static final boolean IS_FRAMEWORK_FRAGMENT = false;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int SLIDE_FROM_BOTTOM = 1;

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static final int SLIDE_FROM_SIDE = 0;
    private static final java.lang.String TAG = "GuidedStepF";
    private static final java.lang.String TAG_LEAN_BACK_ACTIONS_FRAGMENT = "leanBackGuidedStepSupportFragment";
    public static final int UI_STYLE_ACTIVITY_ROOT = 2;

    @java.lang.Deprecated
    public static final int UI_STYLE_DEFAULT = 0;
    public static final int UI_STYLE_ENTRANCE = 1;
    public static final int UI_STYLE_REPLACE = 0;
    private int entranceTransitionType;
    private java.util.List<androidx.leanback.widget.GuidedAction> mActions;
    public androidx.leanback.widget.GuidedActionsStylist mActionsStylist;
    private androidx.leanback.widget.GuidedActionAdapter mAdapter;
    private androidx.leanback.widget.GuidedActionAdapterGroup mAdapterGroup;
    private java.util.List<androidx.leanback.widget.GuidedAction> mButtonActions;
    private androidx.leanback.widget.GuidedActionsStylist mButtonActionsStylist;
    private androidx.leanback.widget.GuidedActionAdapter mButtonAdapter;
    private androidx.leanback.widget.GuidanceStylist mGuidanceStylist;
    private androidx.leanback.widget.GuidedActionAdapter mSubAdapter;
    private android.view.ContextThemeWrapper mThemeWrapper;





    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public static class DummyFragment extends androidx.fragment.app.Fragment {
        public DummyFragment() {
                r0 = this;
                r0.<init>()
                return
        }

        @Override // androidx.fragment.app.Fragment
        public android.view.View onCreateView(android.view.LayoutInflater r1, android.view.ViewGroup r2, android.os.Bundle r3) {
                r0 = this;
                android.view.View r2 = new android.view.View
                android.content.Context r1 = r1.getContext()
                r2.<init>(r1)
                r1 = 8
                r2.setVisibility(r1)
                return r2
        }
    }

    public GuidedStepSupportFragment() {
            r1 = this;
            r1.<init>()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mActions = r0
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r1.mButtonActions = r0
            r0 = 0
            r1.entranceTransitionType = r0
            androidx.leanback.widget.GuidanceStylist r0 = r1.onCreateGuidanceStylist()
            r1.mGuidanceStylist = r0
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.onCreateActionsStylist()
            r1.mActionsStylist = r0
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.onCreateButtonActionsStylist()
            r1.mButtonActionsStylist = r0
            r1.onProvideFragmentTransitions()
            return
    }

    public static int add(androidx.fragment.app.FragmentManager r1, androidx.leanback.app.GuidedStepSupportFragment r2) {
            r0 = 16908290(0x1020002, float:2.3877235E-38)
            int r1 = add(r1, r2, r0)
            return r1
    }

    public static int add(androidx.fragment.app.FragmentManager r4, androidx.leanback.app.GuidedStepSupportFragment r5, int r6) {
            androidx.leanback.app.GuidedStepSupportFragment r0 = getCurrentGuidedStepSupportFragment(r4)
            r1 = 1
            if (r0 == 0) goto L9
            r2 = 1
            goto La
        L9:
            r2 = 0
        La:
            androidx.fragment.app.FragmentTransaction r4 = r4.beginTransaction()
            r2 = r2 ^ r1
            r5.setUiStyle(r2)
            int r2 = r5.getUiStyle()
            java.lang.Class r3 = r5.getClass()
            if (r2 == 0) goto L33
            if (r2 == r1) goto L21
            java.lang.String r1 = ""
            goto L44
        L21:
            java.lang.String r1 = "GuidedStepEntrance"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            goto L44
        L33:
            java.lang.String r1 = "GuidedStepDefault"
            java.lang.StringBuilder r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r1)
            java.lang.String r2 = r3.getName()
            r1.append(r2)
            java.lang.String r1 = r1.toString()
        L44:
            r4.addToBackStack(r1)
            if (r0 == 0) goto Lb0
            android.view.View r0 = r0.getView()
            int r1 = androidx.leanback.R.id.action_fragment_root
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "action_fragment_root"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.action_fragment_background
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "action_fragment_background"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.action_fragment
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "action_fragment"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.guidedactions_root
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "guidedactions_root"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.guidedactions_content
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "guidedactions_content"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.guidedactions_list_background
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "guidedactions_list_background"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.guidedactions_root2
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "guidedactions_root2"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.guidedactions_content2
            android.view.View r1 = r0.findViewById(r1)
            java.lang.String r2 = "guidedactions_content2"
            addNonNullSharedElementTransition(r4, r1, r2)
            int r1 = androidx.leanback.R.id.guidedactions_list_background2
            android.view.View r0 = r0.findViewById(r1)
            java.lang.String r1 = "guidedactions_list_background2"
            addNonNullSharedElementTransition(r4, r0, r1)
        Lb0:
            java.lang.String r0 = "leanBackGuidedStepSupportFragment"
            androidx.fragment.app.FragmentTransaction r4 = r4.replace(r6, r5, r0)
            int r4 = r4.commit()
            return r4
    }

    public static int addAsRoot(androidx.fragment.app.FragmentActivity r2, androidx.leanback.app.GuidedStepSupportFragment r3, int r4) {
            android.view.Window r0 = r2.getWindow()
            r0.getDecorView()
            androidx.fragment.app.FragmentManager r2 = r2.getSupportFragmentManager()
            java.lang.String r0 = "leanBackGuidedStepSupportFragment"
            androidx.fragment.app.Fragment r1 = r2.findFragmentByTag(r0)
            if (r1 == 0) goto L1c
            java.lang.String r2 = "GuidedStepF"
            java.lang.String r3 = "Fragment is already exists, likely calling addAsRoot() when savedInstanceState is not null in Activity.onCreate()."
            android.util.Log.w(r2, r3)
            r2 = -1
            return r2
        L1c:
            androidx.fragment.app.FragmentTransaction r2 = r2.beginTransaction()
            r1 = 2
            r3.setUiStyle(r1)
            androidx.fragment.app.FragmentTransaction r2 = r2.replace(r4, r3, r0)
            int r2 = r2.commit()
            return r2
    }

    private static void addNonNullSharedElementTransition(androidx.fragment.app.FragmentTransaction r0, android.view.View r1, java.lang.String r2) {
            return
    }

    public static androidx.leanback.app.GuidedStepSupportFragment getCurrentGuidedStepSupportFragment(androidx.fragment.app.FragmentManager r1) {
            java.lang.String r0 = "leanBackGuidedStepSupportFragment"
            androidx.fragment.app.Fragment r1 = r1.findFragmentByTag(r0)
            boolean r0 = r1 instanceof androidx.leanback.app.GuidedStepSupportFragment
            if (r0 == 0) goto Ld
            androidx.leanback.app.GuidedStepSupportFragment r1 = (androidx.leanback.app.GuidedStepSupportFragment) r1
            return r1
        Ld:
            r1 = 0
            return r1
    }

    private int getFirstCheckedAction() {
            r4 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r4.mActions
            int r0 = r0.size()
            r1 = 0
            r2 = 0
        L8:
            if (r2 >= r0) goto L1c
            java.util.List<androidx.leanback.widget.GuidedAction> r3 = r4.mActions
            java.lang.Object r3 = r3.get(r2)
            androidx.leanback.widget.GuidedAction r3 = (androidx.leanback.widget.GuidedAction) r3
            boolean r3 = r3.isChecked()
            if (r3 == 0) goto L19
            return r2
        L19:
            int r2 = r2 + 1
            goto L8
        L1c:
            return r1
    }

    private android.view.LayoutInflater getThemeInflater(android.view.LayoutInflater r2) {
            r1 = this;
            android.view.ContextThemeWrapper r0 = r1.mThemeWrapper
            if (r0 != 0) goto L5
            return r2
        L5:
            android.view.LayoutInflater r2 = r2.cloneInContext(r0)
            return r2
    }

    private static boolean isGuidedStepTheme(android.content.Context r3) {
            int r0 = androidx.leanback.R.attr.guidedStepThemeFlag
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r3 = r3.getTheme()
            r2 = 1
            boolean r3 = r3.resolveAttribute(r0, r1, r2)
            if (r3 == 0) goto L1d
            int r3 = r1.type
            r0 = 18
            if (r3 != r0) goto L1d
            int r3 = r1.data
            if (r3 == 0) goto L1d
            goto L1e
        L1d:
            r2 = 0
        L1e:
            return r2
    }

    public static boolean isSaveEnabled(androidx.leanback.widget.GuidedAction r4) {
            boolean r0 = r4.isAutoSaveRestoreEnabled()
            if (r0 == 0) goto L12
            long r0 = r4.getId()
            r2 = -1
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 == 0) goto L12
            r4 = 1
            goto L13
        L12:
            r4 = 0
        L13:
            return r4
    }

    private void resolveTheme() {
            r5 = this;
            android.content.Context r0 = r5.getContext()
            int r1 = r5.onProvideTheme()
            r2 = -1
            if (r1 != r2) goto L41
            boolean r3 = isGuidedStepTheme(r0)
            if (r3 != 0) goto L41
            int r1 = androidx.leanback.R.attr.guidedStepTheme
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r0.getTheme()
            r4 = 1
            boolean r1 = r3.resolveAttribute(r1, r2, r4)
            if (r1 == 0) goto L37
            android.view.ContextThemeWrapper r3 = new android.view.ContextThemeWrapper
            int r2 = r2.resourceId
            r3.<init>(r0, r2)
            boolean r0 = isGuidedStepTheme(r3)
            if (r0 == 0) goto L33
            r5.mThemeWrapper = r3
            goto L37
        L33:
            r1 = 0
            r0 = 0
            r5.mThemeWrapper = r0
        L37:
            if (r1 != 0) goto L4a
            java.lang.String r0 = "GuidedStepF"
            java.lang.String r1 = "GuidedStepSupportFragment does not have an appropriate theme set."
            android.util.Log.e(r0, r1)
            goto L4a
        L41:
            if (r1 == r2) goto L4a
            android.view.ContextThemeWrapper r2 = new android.view.ContextThemeWrapper
            r2.<init>(r0, r1)
            r5.mThemeWrapper = r2
        L4a:
            return
    }

    public void collapseAction(boolean r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            if (r0 == 0) goto Lf
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            if (r0 == 0) goto Lf
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            r0.collapseAction(r2)
        Lf:
            return
    }

    public void collapseSubActions() {
            r1 = this;
            r0 = 1
            r1.collapseAction(r0)
            return
    }

    public void expandAction(androidx.leanback.widget.GuidedAction r2, boolean r3) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            r0.expandAction(r2, r3)
            return
    }

    public void expandSubActions(androidx.leanback.widget.GuidedAction r2) {
            r1 = this;
            boolean r0 = r2.hasSubActions()
            if (r0 != 0) goto L7
            return
        L7:
            r0 = 1
            r1.expandAction(r2, r0)
            return
    }

    public androidx.leanback.widget.GuidedAction findActionById(long r1) {
            r0 = this;
            int r1 = r0.findActionPositionById(r1)
            if (r1 < 0) goto Lf
            java.util.List<androidx.leanback.widget.GuidedAction> r2 = r0.mActions
            java.lang.Object r1 = r2.get(r1)
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public int findActionPositionById(long r5) {
            r4 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r4.mActions
            if (r0 == 0) goto L29
            r0 = 0
        L5:
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r4.mActions
            int r1 = r1.size()
            if (r0 >= r1) goto L29
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r4.mActions
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r4.mActions
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            long r1 = r1.getId()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L26
            return r0
        L26:
            int r0 = r0 + 1
            goto L5
        L29:
            r5 = -1
            return r5
    }

    public androidx.leanback.widget.GuidedAction findButtonActionById(long r1) {
            r0 = this;
            int r1 = r0.findButtonActionPositionById(r1)
            if (r1 < 0) goto Lf
            java.util.List<androidx.leanback.widget.GuidedAction> r2 = r0.mButtonActions
            java.lang.Object r1 = r2.get(r1)
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            goto L10
        Lf:
            r1 = 0
        L10:
            return r1
    }

    public int findButtonActionPositionById(long r5) {
            r4 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r4.mButtonActions
            if (r0 == 0) goto L29
            r0 = 0
        L5:
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r4.mButtonActions
            int r1 = r1.size()
            if (r0 >= r1) goto L29
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r4.mButtonActions
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r4.mButtonActions
            java.lang.Object r1 = r1.get(r0)
            androidx.leanback.widget.GuidedAction r1 = (androidx.leanback.widget.GuidedAction) r1
            long r1 = r1.getId()
            int r3 = (r1 > r5 ? 1 : (r1 == r5 ? 0 : -1))
            if (r3 != 0) goto L26
            return r0
        L26:
            int r0 = r0 + 1
            goto L5
        L29:
            r5 = -1
            return r5
    }

    public void finishGuidedStepSupportFragments() {
            r6 = this;
            androidx.fragment.app.FragmentManager r0 = r6.getFragmentManager()
            int r1 = r0.getBackStackEntryCount()
            if (r1 <= 0) goto L39
            r2 = 1
            int r1 = r1 - r2
        Lc:
            if (r1 < 0) goto L39
            androidx.fragment.app.FragmentManager$BackStackEntry r3 = r0.getBackStackEntryAt(r1)
            java.lang.String r4 = r3.getName()
            if (r4 == 0) goto L22
            java.lang.String r5 = "GuidedStepEntrance"
            boolean r4 = r4.startsWith(r5)
            if (r4 == 0) goto L22
            r4 = 1
            goto L23
        L22:
            r4 = 0
        L23:
            if (r4 == 0) goto L36
            androidx.leanback.app.GuidedStepSupportFragment r1 = getCurrentGuidedStepSupportFragment(r0)
            if (r1 == 0) goto L2e
            r1.setUiStyle(r2)
        L2e:
            int r1 = r3.getId()
            r0.popBackStackImmediate(r1, r2)
            return
        L36:
            int r1 = r1 + (-1)
            goto Lc
        L39:
            androidx.fragment.app.FragmentActivity r0 = r6.getActivity()
            androidx.core.app.ActivityCompat.finishAfterTransition(r0)
            return
    }

    public android.view.View getActionItemView(int r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.findViewHolderForPosition(r2)
            if (r2 != 0) goto Le
            r2 = 0
            goto L10
        Le:
            android.view.View r2 = r2.itemView
        L10:
            return r2
    }

    public java.util.List<androidx.leanback.widget.GuidedAction> getActions() {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mActions
            return r0
    }

    public final java.lang.String getAutoRestoreKey(androidx.leanback.widget.GuidedAction r4) {
            r3 = this;
            java.lang.String r0 = "action_"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r4.getId()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public android.view.View getButtonActionItemView(int r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mButtonActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            androidx.recyclerview.widget.RecyclerView$ViewHolder r2 = r0.findViewHolderForPosition(r2)
            if (r2 != 0) goto Le
            r2 = 0
            goto L10
        Le:
            android.view.View r2 = r2.itemView
        L10:
            return r2
    }

    public java.util.List<androidx.leanback.widget.GuidedAction> getButtonActions() {
            r1 = this;
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r1.mButtonActions
            return r0
    }

    public final java.lang.String getButtonAutoRestoreKey(androidx.leanback.widget.GuidedAction r4) {
            r3 = this;
            java.lang.String r0 = "buttonaction_"
            java.lang.StringBuilder r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0)
            long r1 = r4.getId()
            r0.append(r1)
            java.lang.String r4 = r0.toString()
            return r4
    }

    public androidx.leanback.widget.GuidanceStylist getGuidanceStylist() {
            r1 = this;
            androidx.leanback.widget.GuidanceStylist r0 = r1.mGuidanceStylist
            return r0
    }

    public androidx.leanback.widget.GuidedActionsStylist getGuidedActionsStylist() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            return r0
    }

    public androidx.leanback.widget.GuidedActionsStylist getGuidedButtonActionsStylist() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mButtonActionsStylist
            return r0
    }

    public int getSelectedActionPosition() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            int r0 = r0.getSelectedPosition()
            return r0
    }

    public int getSelectedButtonActionPosition() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mButtonActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            int r0 = r0.getSelectedPosition()
            return r0
    }

    public int getUiStyle() {
            r3 = this;
            android.os.Bundle r0 = r3.getArguments()
            r1 = 1
            if (r0 != 0) goto L8
            return r1
        L8:
            java.lang.String r2 = "uiStyle"
            int r0 = r0.getInt(r2, r1)
            return r0
    }

    public boolean isExpanded() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            boolean r0 = r0.isExpanded()
            return r0
    }

    public boolean isFocusOutEndAllowed() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isFocusOutStartAllowed() {
            r1 = this;
            r0 = 0
            return r0
    }

    public boolean isSubActionsExpanded() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            boolean r0 = r0.isSubActionsExpanded()
            return r0
    }

    public void notifyActionChanged(int r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionAdapter r0 = r1.mAdapter
            if (r0 == 0) goto L7
            r0.notifyItemChanged(r2)
        L7:
            return
    }

    public void notifyButtonActionChanged(int r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionAdapter r0 = r1.mButtonAdapter
            if (r0 == 0) goto L7
            r0.notifyItemChanged(r2)
        L7:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r7) {
            r6 = this;
            super.onCreate(r7)
            r6.onProvideFragmentTransitions()
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.onCreateActions(r0, r7)
            r1 = 0
            if (r7 == 0) goto L2e
            int r2 = r0.size()
            r3 = 0
        L16:
            if (r3 >= r2) goto L2e
            java.lang.Object r4 = r0.get(r3)
            androidx.leanback.widget.GuidedAction r4 = (androidx.leanback.widget.GuidedAction) r4
            boolean r5 = isSaveEnabled(r4)
            if (r5 == 0) goto L2b
            java.lang.String r5 = r6.getAutoRestoreKey(r4)
            r4.onRestoreInstanceState(r7, r5)
        L2b:
            int r3 = r3 + 1
            goto L16
        L2e:
            r6.setActions(r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            r6.onCreateButtonActions(r0, r7)
            if (r7 == 0) goto L57
            int r2 = r0.size()
        L3f:
            if (r1 >= r2) goto L57
            java.lang.Object r3 = r0.get(r1)
            androidx.leanback.widget.GuidedAction r3 = (androidx.leanback.widget.GuidedAction) r3
            boolean r4 = isSaveEnabled(r3)
            if (r4 == 0) goto L54
            java.lang.String r4 = r6.getButtonAutoRestoreKey(r3)
            r3.onRestoreInstanceState(r7, r4)
        L54:
            int r1 = r1 + 1
            goto L3f
        L57:
            r6.setButtonActions(r0)
            return
    }

    public void onCreateActions(@androidx.annotation.NonNull java.util.List<androidx.leanback.widget.GuidedAction> r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public androidx.leanback.widget.GuidedActionsStylist onCreateActionsStylist() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = new androidx.leanback.widget.GuidedActionsStylist
            r0.<init>()
            return r0
    }

    public android.view.View onCreateBackgroundView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            int r4 = androidx.leanback.R.layout.lb_guidedstep_background
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            return r2
    }

    public void onCreateButtonActions(@androidx.annotation.NonNull java.util.List<androidx.leanback.widget.GuidedAction> r1, android.os.Bundle r2) {
            r0 = this;
            return
    }

    public androidx.leanback.widget.GuidedActionsStylist onCreateButtonActionsStylist() {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = new androidx.leanback.widget.GuidedActionsStylist
            r0.<init>()
            r0.setAsButtonActions()
            return r0
    }

    @androidx.annotation.NonNull
    public androidx.leanback.widget.GuidanceStylist.Guidance onCreateGuidance(android.os.Bundle r3) {
            r2 = this;
            androidx.leanback.widget.GuidanceStylist$Guidance r3 = new androidx.leanback.widget.GuidanceStylist$Guidance
            java.lang.String r0 = ""
            r1 = 0
            r3.<init>(r0, r0, r0, r1)
            return r3
    }

    public androidx.leanback.widget.GuidanceStylist onCreateGuidanceStylist() {
            r1 = this;
            androidx.leanback.widget.GuidanceStylist r0 = new androidx.leanback.widget.GuidanceStylist
            r0.<init>()
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r16, android.view.ViewGroup r17, android.os.Bundle r18) {
            r15 = this;
            r6 = r15
            r7 = r18
            r15.resolveTheme()
            android.view.LayoutInflater r8 = r15.getThemeInflater(r16)
            int r0 = androidx.leanback.R.layout.lb_guidedstep_fragment
            r9 = 0
            r1 = r17
            android.view.View r0 = r8.inflate(r0, r1, r9)
            r10 = r0
            androidx.leanback.app.GuidedStepRootLayout r10 = (androidx.leanback.app.GuidedStepRootLayout) r10
            boolean r0 = r15.isFocusOutStartAllowed()
            r10.setFocusOutStart(r0)
            boolean r0 = r15.isFocusOutEndAllowed()
            r10.setFocusOutEnd(r0)
            int r0 = androidx.leanback.R.id.content_fragment
            android.view.View r0 = r10.findViewById(r0)
            android.view.ViewGroup r0 = (android.view.ViewGroup) r0
            int r1 = androidx.leanback.R.id.action_fragment
            android.view.View r1 = r10.findViewById(r1)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            r2 = r1
            androidx.leanback.widget.NonOverlappingLinearLayout r2 = (androidx.leanback.widget.NonOverlappingLinearLayout) r2
            r11 = 1
            r2.setFocusableViewAvailableFixEnabled(r11)
            androidx.leanback.widget.GuidanceStylist$Guidance r2 = r15.onCreateGuidance(r7)
            androidx.leanback.widget.GuidanceStylist r3 = r6.mGuidanceStylist
            android.view.View r2 = r3.onCreateView(r8, r0, r2)
            r0.addView(r2)
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mActionsStylist
            android.view.View r0 = r0.onCreateView(r8, r1)
            r1.addView(r0)
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mButtonActionsStylist
            android.view.View r12 = r0.onCreateView(r8, r1)
            r1.addView(r12)
            androidx.leanback.app.GuidedStepSupportFragment$1 r13 = new androidx.leanback.app.GuidedStepSupportFragment$1
            r13.<init>(r15)
            androidx.leanback.widget.GuidedActionAdapter r14 = new androidx.leanback.widget.GuidedActionAdapter
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r6.mActions
            androidx.leanback.app.GuidedStepSupportFragment$2 r2 = new androidx.leanback.app.GuidedStepSupportFragment$2
            r2.<init>(r15)
            androidx.leanback.widget.GuidedActionsStylist r4 = r6.mActionsStylist
            r5 = 0
            r0 = r14
            r3 = r15
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mAdapter = r14
            androidx.leanback.widget.GuidedActionAdapter r14 = new androidx.leanback.widget.GuidedActionAdapter
            java.util.List<androidx.leanback.widget.GuidedAction> r1 = r6.mButtonActions
            androidx.leanback.app.GuidedStepSupportFragment$3 r2 = new androidx.leanback.app.GuidedStepSupportFragment$3
            r2.<init>(r15)
            androidx.leanback.widget.GuidedActionsStylist r4 = r6.mButtonActionsStylist
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mButtonAdapter = r14
            androidx.leanback.widget.GuidedActionAdapter r14 = new androidx.leanback.widget.GuidedActionAdapter
            androidx.leanback.app.GuidedStepSupportFragment$4 r2 = new androidx.leanback.app.GuidedStepSupportFragment$4
            r2.<init>(r15)
            androidx.leanback.widget.GuidedActionsStylist r4 = r6.mActionsStylist
            r1 = 0
            r5 = 1
            r0 = r14
            r0.<init>(r1, r2, r3, r4, r5)
            r6.mSubAdapter = r14
            androidx.leanback.widget.GuidedActionAdapterGroup r0 = new androidx.leanback.widget.GuidedActionAdapterGroup
            r0.<init>()
            r6.mAdapterGroup = r0
            androidx.leanback.widget.GuidedActionAdapter r1 = r6.mAdapter
            androidx.leanback.widget.GuidedActionAdapter r2 = r6.mButtonAdapter
            r0.addAdpter(r1, r2)
            androidx.leanback.widget.GuidedActionAdapterGroup r0 = r6.mAdapterGroup
            androidx.leanback.widget.GuidedActionAdapter r1 = r6.mSubAdapter
            r2 = 0
            r0.addAdpter(r1, r2)
            androidx.leanback.widget.GuidedActionAdapterGroup r0 = r6.mAdapterGroup
            r0.setEditListener(r13)
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mActionsStylist
            r0.setEditListener(r13)
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            androidx.leanback.widget.GuidedActionAdapter r1 = r6.mAdapter
            r0.setAdapter(r1)
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getSubActionsGridView()
            if (r0 == 0) goto Ld2
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getSubActionsGridView()
            androidx.leanback.widget.GuidedActionAdapter r1 = r6.mSubAdapter
            r0.setAdapter(r1)
        Ld2:
            androidx.leanback.widget.GuidedActionsStylist r0 = r6.mButtonActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            androidx.leanback.widget.GuidedActionAdapter r1 = r6.mButtonAdapter
            r0.setAdapter(r1)
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r6.mButtonActions
            int r0 = r0.size()
            if (r0 != 0) goto Lf2
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r0 = (android.widget.LinearLayout.LayoutParams) r0
            r1 = 0
            r0.weight = r1
            r12.setLayoutParams(r0)
            goto L121
        Lf2:
            android.view.ContextThemeWrapper r0 = r6.mThemeWrapper
            if (r0 == 0) goto Lf7
            goto Lfb
        Lf7:
            android.content.Context r0 = r15.getContext()
        Lfb:
            android.util.TypedValue r1 = new android.util.TypedValue
            r1.<init>()
            android.content.res.Resources$Theme r0 = r0.getTheme()
            int r2 = androidx.leanback.R.attr.guidedActionContentWidthWeightTwoPanels
            boolean r0 = r0.resolveAttribute(r2, r1, r11)
            if (r0 == 0) goto L121
            int r0 = androidx.leanback.R.id.action_fragment_root
            android.view.View r0 = r10.findViewById(r0)
            float r1 = r1.getFloat()
            android.view.ViewGroup$LayoutParams r2 = r0.getLayoutParams()
            android.widget.LinearLayout$LayoutParams r2 = (android.widget.LinearLayout.LayoutParams) r2
            r2.weight = r1
            r0.setLayoutParams(r2)
        L121:
            android.view.View r0 = r15.onCreateBackgroundView(r8, r10, r7)
            if (r0 == 0) goto L132
            int r1 = androidx.leanback.R.id.guidedstep_background_view_root
            android.view.View r1 = r10.findViewById(r1)
            android.widget.FrameLayout r1 = (android.widget.FrameLayout) r1
            r1.addView(r0, r9)
        L132:
            return r10
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
            r1 = this;
            androidx.leanback.widget.GuidanceStylist r0 = r1.mGuidanceStylist
            r0.onDestroyView()
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            r0.onDestroyView()
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mButtonActionsStylist
            r0.onDestroyView()
            r0 = 0
            r1.mAdapter = r0
            r1.mSubAdapter = r0
            r1.mButtonAdapter = r0
            r1.mAdapterGroup = r0
            super.onDestroyView()
            return
    }

    public void onGuidedActionClicked(androidx.leanback.widget.GuidedAction r1) {
            r0 = this;
            return
    }

    public void onGuidedActionEditCanceled(androidx.leanback.widget.GuidedAction r1) {
            r0 = this;
            r0.onGuidedActionEdited(r1)
            return
    }

    @java.lang.Deprecated
    public void onGuidedActionEdited(androidx.leanback.widget.GuidedAction r1) {
            r0 = this;
            return
    }

    public long onGuidedActionEditedAndProceed(androidx.leanback.widget.GuidedAction r3) {
            r2 = this;
            r2.onGuidedActionEdited(r3)
            r0 = -2
            return r0
    }

    @Override // androidx.leanback.widget.GuidedActionAdapter.FocusListener
    public void onGuidedActionFocused(androidx.leanback.widget.GuidedAction r1) {
            r0 = this;
            return
    }

    public final void onProvideFragmentTransitions() {
            r6 = this;
            int r0 = r6.getUiStyle()
            r1 = 3
            r2 = 0
            r3 = 1
            if (r0 != 0) goto L36
            r0 = 8388613(0x800005, float:1.175495E-38)
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createFadeAndShortSlide(r0)
            int r4 = androidx.leanback.R.id.guidedstep_background
            androidx.leanback.transition.TransitionHelper.exclude(r0, r4, r3)
            int r4 = androidx.leanback.R.id.guidedactions_sub_list_background
            androidx.leanback.transition.TransitionHelper.exclude(r0, r4, r3)
            r6.setEnterTransition(r0)
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createFadeTransition(r1)
            androidx.leanback.transition.TransitionHelper.include(r0, r4)
            java.lang.Object r1 = androidx.leanback.transition.TransitionHelper.createChangeBounds(r2)
            java.lang.Object r2 = androidx.leanback.transition.TransitionHelper.createTransitionSet(r2)
            androidx.leanback.transition.TransitionHelper.addTransition(r2, r0)
            androidx.leanback.transition.TransitionHelper.addTransition(r2, r1)
            r6.setSharedElementEnterTransition(r2)
            goto L87
        L36:
            r4 = 0
            if (r0 != r3) goto L7e
            int r0 = r6.entranceTransitionType
            if (r0 != 0) goto L65
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createFadeTransition(r1)
            int r1 = androidx.leanback.R.id.guidedstep_background
            androidx.leanback.transition.TransitionHelper.include(r0, r1)
            r1 = 8388615(0x800007, float:1.1754953E-38)
            java.lang.Object r1 = androidx.leanback.transition.TransitionHelper.createFadeAndShortSlide(r1)
            int r5 = androidx.leanback.R.id.content_fragment
            androidx.leanback.transition.TransitionHelper.include(r1, r5)
            int r5 = androidx.leanback.R.id.action_fragment_root
            androidx.leanback.transition.TransitionHelper.include(r1, r5)
            java.lang.Object r2 = androidx.leanback.transition.TransitionHelper.createTransitionSet(r2)
            androidx.leanback.transition.TransitionHelper.addTransition(r2, r0)
            androidx.leanback.transition.TransitionHelper.addTransition(r2, r1)
            r6.setEnterTransition(r2)
            goto L7a
        L65:
            r0 = 80
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createFadeAndShortSlide(r0)
            int r1 = androidx.leanback.R.id.guidedstep_background_view_root
            androidx.leanback.transition.TransitionHelper.include(r0, r1)
            java.lang.Object r1 = androidx.leanback.transition.TransitionHelper.createTransitionSet(r2)
            androidx.leanback.transition.TransitionHelper.addTransition(r1, r0)
            r6.setEnterTransition(r1)
        L7a:
            r6.setSharedElementEnterTransition(r4)
            goto L87
        L7e:
            r1 = 2
            if (r0 != r1) goto L87
            r6.setEnterTransition(r4)
            r6.setSharedElementEnterTransition(r4)
        L87:
            r0 = 8388611(0x800003, float:1.1754948E-38)
            java.lang.Object r0 = androidx.leanback.transition.TransitionHelper.createFadeAndShortSlide(r0)
            int r1 = androidx.leanback.R.id.guidedstep_background
            androidx.leanback.transition.TransitionHelper.exclude(r0, r1, r3)
            int r1 = androidx.leanback.R.id.guidedactions_sub_list_background
            androidx.leanback.transition.TransitionHelper.exclude(r0, r1, r3)
            r6.setExitTransition(r0)
            return
    }

    public int onProvideTheme() {
            r1 = this;
            r0 = -1
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
            r2 = this;
            super.onResume()
            android.view.View r0 = r2.getView()
            int r1 = androidx.leanback.R.id.action_fragment
            android.view.View r0 = r0.findViewById(r1)
            r0.requestFocus()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(android.os.Bundle r7) {
            r6 = this;
            super.onSaveInstanceState(r7)
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r6.mActions
            int r1 = r0.size()
            r2 = 0
            r3 = 0
        Lb:
            if (r3 >= r1) goto L23
            java.lang.Object r4 = r0.get(r3)
            androidx.leanback.widget.GuidedAction r4 = (androidx.leanback.widget.GuidedAction) r4
            boolean r5 = isSaveEnabled(r4)
            if (r5 == 0) goto L20
            java.lang.String r5 = r6.getAutoRestoreKey(r4)
            r4.onSaveInstanceState(r7, r5)
        L20:
            int r3 = r3 + 1
            goto Lb
        L23:
            java.util.List<androidx.leanback.widget.GuidedAction> r0 = r6.mButtonActions
            int r1 = r0.size()
        L29:
            if (r2 >= r1) goto L41
            java.lang.Object r3 = r0.get(r2)
            androidx.leanback.widget.GuidedAction r3 = (androidx.leanback.widget.GuidedAction) r3
            boolean r4 = isSaveEnabled(r3)
            if (r4 == 0) goto L3e
            java.lang.String r4 = r6.getButtonAutoRestoreKey(r3)
            r3.onSaveInstanceState(r7, r4)
        L3e:
            int r2 = r2 + 1
            goto L29
        L41:
            return
    }

    public boolean onSubGuidedActionClicked(androidx.leanback.widget.GuidedAction r1) {
            r0 = this;
            r1 = 1
            return r1
    }

    public void openInEditMode(androidx.leanback.widget.GuidedAction r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            r0.openInEditMode(r2)
            return
    }

    public void popBackStackToGuidedStepSupportFragment(java.lang.Class r6, int r7) {
            r5 = this;
            java.lang.Class<androidx.leanback.app.GuidedStepSupportFragment> r0 = androidx.leanback.app.GuidedStepSupportFragment.class
            boolean r0 = r0.isAssignableFrom(r6)
            if (r0 != 0) goto L9
            return
        L9:
            androidx.fragment.app.FragmentManager r0 = r5.getFragmentManager()
            int r1 = r0.getBackStackEntryCount()
            java.lang.String r6 = r6.getName()
            if (r1 <= 0) goto L54
            int r1 = r1 + (-1)
        L19:
            if (r1 < 0) goto L54
            androidx.fragment.app.FragmentManager$BackStackEntry r2 = r0.getBackStackEntryAt(r1)
            java.lang.String r3 = r2.getName()
            java.lang.String r4 = "GuidedStepDefault"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L32
            r4 = 17
            java.lang.String r3 = r3.substring(r4)
            goto L43
        L32:
            java.lang.String r4 = "GuidedStepEntrance"
            boolean r4 = r3.startsWith(r4)
            if (r4 == 0) goto L41
            r4 = 18
            java.lang.String r3 = r3.substring(r4)
            goto L43
        L41:
            java.lang.String r3 = ""
        L43:
            boolean r3 = r6.equals(r3)
            if (r3 == 0) goto L51
            int r6 = r2.getId()
            r0.popBackStackImmediate(r6, r7)
            return
        L51:
            int r1 = r1 + (-1)
            goto L19
        L54:
            return
    }

    public final void runImeAnimations(boolean r2) {
            r1 = this;
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            if (r2 == 0) goto L17
            androidx.leanback.widget.GuidanceStylist r2 = r1.mGuidanceStylist
            r2.onImeAppearing(r0)
            androidx.leanback.widget.GuidedActionsStylist r2 = r1.mActionsStylist
            r2.onImeAppearing(r0)
            androidx.leanback.widget.GuidedActionsStylist r2 = r1.mButtonActionsStylist
            r2.onImeAppearing(r0)
            goto L26
        L17:
            androidx.leanback.widget.GuidanceStylist r2 = r1.mGuidanceStylist
            r2.onImeDisappearing(r0)
            androidx.leanback.widget.GuidedActionsStylist r2 = r1.mActionsStylist
            r2.onImeDisappearing(r0)
            androidx.leanback.widget.GuidedActionsStylist r2 = r1.mButtonActionsStylist
            r2.onImeDisappearing(r0)
        L26:
            android.animation.AnimatorSet r2 = new android.animation.AnimatorSet
            r2.<init>()
            r2.playTogether(r0)
            r2.start()
            return
    }

    public void setActions(java.util.List<androidx.leanback.widget.GuidedAction> r2) {
            r1 = this;
            r1.mActions = r2
            androidx.leanback.widget.GuidedActionAdapter r0 = r1.mAdapter
            if (r0 == 0) goto L9
            r0.setActions(r2)
        L9:
            return
    }

    public void setActionsDiffCallback(androidx.leanback.widget.DiffCallback<androidx.leanback.widget.GuidedAction> r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionAdapter r0 = r1.mAdapter
            r0.setDiffCallback(r2)
            return
    }

    public void setButtonActions(java.util.List<androidx.leanback.widget.GuidedAction> r2) {
            r1 = this;
            r1.mButtonActions = r2
            androidx.leanback.widget.GuidedActionAdapter r0 = r1.mButtonAdapter
            if (r0 == 0) goto L9
            r0.setActions(r2)
        L9:
            return
    }

    @androidx.annotation.RestrictTo({androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP})
    public void setEntranceTransitionType(int r1) {
            r0 = this;
            r0.entranceTransitionType = r1
            return
    }

    public void setSelectedActionPosition(int r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            r0.setSelectedPosition(r2)
            return
    }

    public void setSelectedButtonActionPosition(int r2) {
            r1 = this;
            androidx.leanback.widget.GuidedActionsStylist r0 = r1.mButtonActionsStylist
            androidx.leanback.widget.VerticalGridView r0 = r0.getActionsGridView()
            r0.setSelectedPosition(r2)
            return
    }

    public void setUiStyle(int r5) {
            r4 = this;
            int r0 = r4.getUiStyle()
            android.os.Bundle r1 = r4.getArguments()
            if (r1 != 0) goto L11
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r2 = 1
            goto L12
        L11:
            r2 = 0
        L12:
            java.lang.String r3 = "uiStyle"
            r1.putInt(r3, r5)
            if (r2 == 0) goto L1d
            r4.setArguments(r1)
        L1d:
            if (r5 == r0) goto L22
            r4.onProvideFragmentTransitions()
        L22:
            return
    }
}
