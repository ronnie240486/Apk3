package androidx.leanback.app;

/* JADX INFO: loaded from: classes.dex */
public class SearchSupportFragment extends androidx.fragment.app.Fragment {
    private static final java.lang.String ARG_PREFIX = null;
    private static final java.lang.String ARG_QUERY = null;
    private static final java.lang.String ARG_TITLE = null;
    private static final java.lang.String EXTRA_LEANBACK_BADGE_PRESENT = "LEANBACK_BADGE_PRESENT";
    public final androidx.leanback.widget.ObjectAdapter.DataObserver mAdapterObserver;
    public boolean mAutoStartRecognition;
    private android.graphics.drawable.Drawable mBadgeDrawable;
    private androidx.leanback.app.SearchSupportFragment.ExternalQuery mExternalQuery;
    public final android.os.Handler mHandler;
    private boolean mIsPaused;
    private androidx.leanback.widget.OnItemViewClickedListener mOnItemViewClickedListener;
    public androidx.leanback.widget.OnItemViewSelectedListener mOnItemViewSelectedListener;
    public java.lang.String mPendingQuery;
    private boolean mPendingStartRecognitionWhenPaused;
    private androidx.leanback.widget.SearchBar.SearchBarPermissionListener mPermissionListener;
    public androidx.leanback.app.SearchSupportFragment.SearchResultProvider mProvider;
    public androidx.leanback.widget.ObjectAdapter mResultAdapter;
    public final java.lang.Runnable mResultsChangedCallback;
    public androidx.leanback.app.RowsSupportFragment mRowsSupportFragment;
    public androidx.leanback.widget.SearchBar mSearchBar;
    private final java.lang.Runnable mSetSearchResultProvider;
    private androidx.leanback.widget.SpeechRecognitionCallback mSpeechRecognitionCallback;
    private android.speech.SpeechRecognizer mSpeechRecognizer;
    public final java.lang.Runnable mStartRecognitionRunnable;
    public int mStatus;
    private java.lang.String mTitle;








    public static class ExternalQuery {
        public java.lang.String mQuery;
        public boolean mSubmit;

        public ExternalQuery(java.lang.String r1, boolean r2) {
                r0 = this;
                r0.<init>()
                r0.mQuery = r1
                r0.mSubmit = r2
                return
        }
    }

    /* JADX INFO: loaded from: classes2.dex */
    public interface SearchResultProvider {
        androidx.leanback.widget.ObjectAdapter getResultsAdapter();

        boolean onQueryTextChange(java.lang.String r1);

        boolean onQueryTextSubmit(java.lang.String r1);
    }

    static {
            java.lang.Class<androidx.leanback.app.SearchSupportFragment> r0 = androidx.leanback.app.SearchSupportFragment.class
            java.lang.Class<androidx.leanback.app.SearchSupportFragment> r0 = androidx.leanback.app.SearchSupportFragment.class
            java.lang.String r0 = r0.getCanonicalName()
            androidx.leanback.app.SearchSupportFragment.ARG_PREFIX = r0
            java.lang.String r1 = ".query"
            java.lang.String r1 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            androidx.leanback.app.SearchSupportFragment.ARG_QUERY = r1
            java.lang.String r1 = ".title"
            java.lang.String r0 = androidx.core.graphics.Insets$$ExternalSyntheticOutline0.m(r0, r1)
            androidx.leanback.app.SearchSupportFragment.ARG_TITLE = r0
            return
    }

    public SearchSupportFragment() {
            r1 = this;
            r1.<init>()
            androidx.leanback.app.SearchSupportFragment$1 r0 = new androidx.leanback.app.SearchSupportFragment$1
            r0.<init>(r1)
            r1.mAdapterObserver = r0
            android.os.Handler r0 = new android.os.Handler
            r0.<init>()
            r1.mHandler = r0
            androidx.leanback.app.SearchSupportFragment$2 r0 = new androidx.leanback.app.SearchSupportFragment$2
            r0.<init>(r1)
            r1.mResultsChangedCallback = r0
            androidx.leanback.app.SearchSupportFragment$3 r0 = new androidx.leanback.app.SearchSupportFragment$3
            r0.<init>(r1)
            r1.mSetSearchResultProvider = r0
            androidx.leanback.app.SearchSupportFragment$4 r0 = new androidx.leanback.app.SearchSupportFragment$4
            r0.<init>(r1)
            r1.mStartRecognitionRunnable = r0
            r0 = 0
            r1.mPendingQuery = r0
            r0 = 1
            r1.mAutoStartRecognition = r0
            androidx.leanback.app.SearchSupportFragment$5 r0 = new androidx.leanback.app.SearchSupportFragment$5
            r0.<init>(r1)
            r1.mPermissionListener = r0
            return
    }

    private void applyExternalQuery() {
            r2 = this;
            androidx.leanback.app.SearchSupportFragment$ExternalQuery r0 = r2.mExternalQuery
            if (r0 == 0) goto L29
            androidx.leanback.widget.SearchBar r1 = r2.mSearchBar
            if (r1 != 0) goto L9
            goto L29
        L9:
            java.lang.String r0 = r0.mQuery
            r1.setSearchQuery(r0)
            androidx.leanback.app.SearchSupportFragment$ExternalQuery r0 = r2.mExternalQuery
            boolean r1 = r0.mSubmit
            if (r1 == 0) goto L26
            java.lang.String r0 = r0.mQuery
            int r1 = r2.mStatus
            r1 = r1 | 2
            r2.mStatus = r1
            r2.focusOnResults()
            androidx.leanback.app.SearchSupportFragment$SearchResultProvider r1 = r2.mProvider
            if (r1 == 0) goto L26
            r1.onQueryTextSubmit(r0)
        L26:
            r0 = 0
            r2.mExternalQuery = r0
        L29:
            return
    }

    public static android.os.Bundle createArgs(android.os.Bundle r1, java.lang.String r2) {
            r0 = 0
            android.os.Bundle r1 = createArgs(r1, r2, r0)
            return r1
    }

    public static android.os.Bundle createArgs(android.os.Bundle r1, java.lang.String r2, java.lang.String r3) {
            if (r1 != 0) goto L7
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
        L7:
            java.lang.String r0 = androidx.leanback.app.SearchSupportFragment.ARG_QUERY
            r1.putString(r0, r2)
            java.lang.String r2 = androidx.leanback.app.SearchSupportFragment.ARG_TITLE
            r1.putString(r2, r3)
            return r1
    }

    private void focusOnResults() {
            r1 = this;
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            if (r0 == 0) goto L25
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            if (r0 == 0) goto L25
            androidx.leanback.widget.ObjectAdapter r0 = r1.mResultAdapter
            int r0 = r0.size()
            if (r0 != 0) goto L13
            goto L25
        L13:
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            boolean r0 = r0.requestFocus()
            if (r0 == 0) goto L25
            int r0 = r1.mStatus
            r0 = r0 & (-2)
            r1.mStatus = r0
        L25:
            return
    }

    public static androidx.leanback.app.SearchSupportFragment newInstance(java.lang.String r2) {
            androidx.leanback.app.SearchSupportFragment r0 = new androidx.leanback.app.SearchSupportFragment
            r0.<init>()
            r1 = 0
            android.os.Bundle r2 = createArgs(r1, r2)
            r0.setArguments(r2)
            return r0
    }

    private void onSetSearchResultProvider() {
            r2 = this;
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mSetSearchResultProvider
            r0.removeCallbacks(r1)
            android.os.Handler r0 = r2.mHandler
            java.lang.Runnable r1 = r2.mSetSearchResultProvider
            r0.post(r1)
            return
    }

    private void readArguments(android.os.Bundle r3) {
            r2 = this;
            if (r3 != 0) goto L3
            return
        L3:
            java.lang.String r0 = androidx.leanback.app.SearchSupportFragment.ARG_QUERY
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L12
            java.lang.String r0 = r3.getString(r0)
            r2.setSearchQuery(r0)
        L12:
            java.lang.String r0 = androidx.leanback.app.SearchSupportFragment.ARG_TITLE
            boolean r1 = r3.containsKey(r0)
            if (r1 == 0) goto L21
            java.lang.String r3 = r3.getString(r0)
            r2.setTitle(r3)
        L21:
            return
    }

    private void releaseRecognizer() {
            r2 = this;
            android.speech.SpeechRecognizer r0 = r2.mSpeechRecognizer
            if (r0 == 0) goto L11
            androidx.leanback.widget.SearchBar r0 = r2.mSearchBar
            r1 = 0
            r0.setSpeechRecognizer(r1)
            android.speech.SpeechRecognizer r0 = r2.mSpeechRecognizer
            r0.destroy()
            r2.mSpeechRecognizer = r1
        L11:
            return
    }

    private void resultsAvailable() {
            r1 = this;
            int r0 = r1.mStatus
            r0 = r0 & 2
            if (r0 == 0) goto L9
            r1.focusOnResults()
        L9:
            r1.updateSearchBarNextFocusId()
            return
    }

    private void setSearchQuery(java.lang.String r2) {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            r0.setSearchQuery(r2)
            return
    }

    public void displayCompletions(java.util.List<java.lang.String> r2) {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            r0.displayCompletions(r2)
            return
    }

    public void displayCompletions(android.view.inputmethod.CompletionInfo[] r2) {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            r0.displayCompletions(r2)
            return
    }

    public android.graphics.drawable.Drawable getBadgeDrawable() {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L9
            android.graphics.drawable.Drawable r0 = r0.getBadgeDrawable()
            return r0
        L9:
            r0 = 0
            return r0
    }

    public android.content.Intent getRecognizerIntent() {
            r4 = this;
            android.content.Intent r0 = new android.content.Intent
            java.lang.String r1 = "android.speech.action.RECOGNIZE_SPEECH"
            r0.<init>(r1)
            java.lang.String r1 = "android.speech.extra.LANGUAGE_MODEL"
            java.lang.String r2 = "free_form"
            r0.putExtra(r1, r2)
            java.lang.String r1 = "android.speech.extra.PARTIAL_RESULTS"
            r2 = 1
            r0.putExtra(r1, r2)
            androidx.leanback.widget.SearchBar r1 = r4.mSearchBar
            if (r1 == 0) goto L29
            java.lang.CharSequence r1 = r1.getHint()
            if (r1 == 0) goto L29
            androidx.leanback.widget.SearchBar r1 = r4.mSearchBar
            java.lang.CharSequence r1 = r1.getHint()
            java.lang.String r3 = "android.speech.extra.PROMPT"
            r0.putExtra(r3, r1)
        L29:
            android.graphics.drawable.Drawable r1 = r4.mBadgeDrawable
            if (r1 == 0) goto L2e
            goto L2f
        L2e:
            r2 = 0
        L2f:
            java.lang.String r1 = "LEANBACK_BADGE_PRESENT"
            r0.putExtra(r1, r2)
            return r0
    }

    public androidx.leanback.app.RowsSupportFragment getRowsSupportFragment() {
            r1 = this;
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            return r0
    }

    public java.lang.String getTitle() {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L9
            java.lang.String r0 = r0.getTitle()
            return r0
        L9:
            r0 = 0
            return r0
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(android.os.Bundle r2) {
            r1 = this;
            boolean r0 = r1.mAutoStartRecognition
            if (r0 == 0) goto Lb
            if (r2 != 0) goto L8
            r0 = 1
            goto L9
        L8:
            r0 = 0
        L9:
            r1.mAutoStartRecognition = r0
        Lb:
            super.onCreate(r2)
            return
    }

    @Override // androidx.fragment.app.Fragment
    public android.view.View onCreateView(android.view.LayoutInflater r2, android.view.ViewGroup r3, android.os.Bundle r4) {
            r1 = this;
            int r4 = androidx.leanback.R.layout.lb_search_fragment
            r0 = 0
            android.view.View r2 = r2.inflate(r4, r3, r0)
            int r3 = androidx.leanback.R.id.lb_search_frame
            android.view.View r3 = r2.findViewById(r3)
            android.widget.FrameLayout r3 = (android.widget.FrameLayout) r3
            int r4 = androidx.leanback.R.id.lb_search_bar
            android.view.View r3 = r3.findViewById(r4)
            androidx.leanback.widget.SearchBar r3 = (androidx.leanback.widget.SearchBar) r3
            r1.mSearchBar = r3
            androidx.leanback.app.SearchSupportFragment$6 r4 = new androidx.leanback.app.SearchSupportFragment$6
            r4.<init>(r1)
            r3.setSearchBarListener(r4)
            androidx.leanback.widget.SearchBar r3 = r1.mSearchBar
            androidx.leanback.widget.SpeechRecognitionCallback r4 = r1.mSpeechRecognitionCallback
            r3.setSpeechRecognitionCallback(r4)
            androidx.leanback.widget.SearchBar r3 = r1.mSearchBar
            androidx.leanback.widget.SearchBar$SearchBarPermissionListener r4 = r1.mPermissionListener
            r3.setPermissionListener(r4)
            r1.applyExternalQuery()
            android.os.Bundle r3 = r1.getArguments()
            r1.readArguments(r3)
            android.graphics.drawable.Drawable r3 = r1.mBadgeDrawable
            if (r3 == 0) goto L40
            r1.setBadgeDrawable(r3)
        L40:
            java.lang.String r3 = r1.mTitle
            if (r3 == 0) goto L47
            r1.setTitle(r3)
        L47:
            androidx.fragment.app.FragmentManager r3 = r1.getChildFragmentManager()
            int r4 = androidx.leanback.R.id.lb_results_frame
            androidx.fragment.app.Fragment r3 = r3.findFragmentById(r4)
            if (r3 != 0) goto L6c
            androidx.leanback.app.RowsSupportFragment r3 = new androidx.leanback.app.RowsSupportFragment
            r3.<init>()
            r1.mRowsSupportFragment = r3
            androidx.fragment.app.FragmentManager r3 = r1.getChildFragmentManager()
            androidx.fragment.app.FragmentTransaction r3 = r3.beginTransaction()
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            androidx.fragment.app.FragmentTransaction r3 = r3.replace(r4, r0)
            r3.commit()
            goto L78
        L6c:
            androidx.fragment.app.FragmentManager r3 = r1.getChildFragmentManager()
            androidx.fragment.app.Fragment r3 = r3.findFragmentById(r4)
            androidx.leanback.app.RowsSupportFragment r3 = (androidx.leanback.app.RowsSupportFragment) r3
            r1.mRowsSupportFragment = r3
        L78:
            androidx.leanback.app.RowsSupportFragment r3 = r1.mRowsSupportFragment
            androidx.leanback.app.SearchSupportFragment$7 r4 = new androidx.leanback.app.SearchSupportFragment$7
            r4.<init>(r1)
            r3.setOnItemViewSelectedListener(r4)
            androidx.leanback.app.RowsSupportFragment r3 = r1.mRowsSupportFragment
            androidx.leanback.widget.OnItemViewClickedListener r4 = r1.mOnItemViewClickedListener
            r3.setOnItemViewClickedListener(r4)
            androidx.leanback.app.RowsSupportFragment r3 = r1.mRowsSupportFragment
            r4 = 1
            r3.setExpand(r4)
            androidx.leanback.app.SearchSupportFragment$SearchResultProvider r3 = r1.mProvider
            if (r3 == 0) goto L96
            r1.onSetSearchResultProvider()
        L96:
            return r2
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mResultAdapter
            if (r0 == 0) goto Lc
            androidx.leanback.widget.ObjectAdapter$DataObserver r1 = r2.mAdapterObserver
            r0.unregisterObserver(r1)
            r0 = 0
            r2.mResultAdapter = r0
        Lc:
            super.onDestroy()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
            r1 = this;
            r1.releaseRecognizer()
            r0 = 1
            r1.mIsPaused = r0
            super.onPause()
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onRequestPermissionsResult(int r2, java.lang.String[] r3, int[] r4) {
            r1 = this;
            if (r2 != 0) goto L17
            int r2 = r3.length
            if (r2 <= 0) goto L17
            r2 = 0
            r3 = r3[r2]
            java.lang.String r0 = "android.permission.RECORD_AUDIO"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L17
            r2 = r4[r2]
            if (r2 != 0) goto L17
            r1.startRecognition()
        L17:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
            r3 = this;
            super.onResume()
            r0 = 0
            r3.mIsPaused = r0
            androidx.leanback.widget.SpeechRecognitionCallback r1 = r3.mSpeechRecognitionCallback
            if (r1 != 0) goto L1d
            android.speech.SpeechRecognizer r1 = r3.mSpeechRecognizer
            if (r1 != 0) goto L1d
            android.content.Context r1 = r3.getContext()
            android.speech.SpeechRecognizer r1 = android.speech.SpeechRecognizer.createSpeechRecognizer(r1)
            r3.mSpeechRecognizer = r1
            androidx.leanback.widget.SearchBar r2 = r3.mSearchBar
            r2.setSpeechRecognizer(r1)
        L1d:
            boolean r1 = r3.mPendingStartRecognitionWhenPaused
            if (r1 == 0) goto L29
            r3.mPendingStartRecognitionWhenPaused = r0
            androidx.leanback.widget.SearchBar r0 = r3.mSearchBar
            r0.startRecognition()
            goto L2e
        L29:
            androidx.leanback.widget.SearchBar r0 = r3.mSearchBar
            r0.stopRecognition()
        L2e:
            return
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
            r4 = this;
            super.onStart()
            androidx.leanback.app.RowsSupportFragment r0 = r4.mRowsSupportFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            android.content.res.Resources r1 = r4.getResources()
            int r2 = androidx.leanback.R.dimen.lb_search_browse_rows_align_top
            int r1 = r1.getDimensionPixelSize(r2)
            r2 = 0
            r0.setItemAlignmentOffset(r2)
            r3 = -1082130432(0xffffffffbf800000, float:-1.0)
            r0.setItemAlignmentOffsetPercent(r3)
            r0.setWindowAlignmentOffset(r1)
            r0.setWindowAlignmentOffsetPercent(r3)
            r0.setWindowAlignment(r2)
            r0.setFocusable(r2)
            r0.setFocusableInTouchMode(r2)
            return
    }

    public final void queryComplete() {
            r1 = this;
            int r0 = r1.mStatus
            r0 = r0 | 2
            r1.mStatus = r0
            r1.focusOnResults()
            return
    }

    public void setBadgeDrawable(android.graphics.drawable.Drawable r2) {
            r1 = this;
            r1.mBadgeDrawable = r2
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L9
            r0.setBadgeDrawable(r2)
        L9:
            return
    }

    public void setOnItemViewClickedListener(androidx.leanback.widget.OnItemViewClickedListener r2) {
            r1 = this;
            androidx.leanback.widget.OnItemViewClickedListener r0 = r1.mOnItemViewClickedListener
            if (r2 == r0) goto Ld
            r1.mOnItemViewClickedListener = r2
            androidx.leanback.app.RowsSupportFragment r0 = r1.mRowsSupportFragment
            if (r0 == 0) goto Ld
            r0.setOnItemViewClickedListener(r2)
        Ld:
            return
    }

    public void setOnItemViewSelectedListener(androidx.leanback.widget.OnItemViewSelectedListener r1) {
            r0 = this;
            r0.mOnItemViewSelectedListener = r1
            return
    }

    public void setSearchAffordanceColors(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L7
            r0.setSearchAffordanceColors(r2)
        L7:
            return
    }

    public void setSearchAffordanceColorsInListening(androidx.leanback.widget.SearchOrbView.Colors r2) {
            r1 = this;
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L7
            r0.setSearchAffordanceColorsInListening(r2)
        L7:
            return
    }

    public void setSearchQuery(android.content.Intent r2, boolean r3) {
            r1 = this;
            java.lang.String r0 = "android.speech.extra.RESULTS"
            java.util.ArrayList r2 = r2.getStringArrayListExtra(r0)
            if (r2 == 0) goto L18
            int r0 = r2.size()
            if (r0 <= 0) goto L18
            r0 = 0
            java.lang.Object r2 = r2.get(r0)
            java.lang.String r2 = (java.lang.String) r2
            r1.setSearchQuery(r2, r3)
        L18:
            return
    }

    public void setSearchQuery(java.lang.String r2, boolean r3) {
            r1 = this;
            if (r2 != 0) goto L3
            return
        L3:
            androidx.leanback.app.SearchSupportFragment$ExternalQuery r0 = new androidx.leanback.app.SearchSupportFragment$ExternalQuery
            r0.<init>(r2, r3)
            r1.mExternalQuery = r0
            r1.applyExternalQuery()
            boolean r2 = r1.mAutoStartRecognition
            if (r2 == 0) goto L1b
            r2 = 0
            r1.mAutoStartRecognition = r2
            android.os.Handler r2 = r1.mHandler
            java.lang.Runnable r3 = r1.mStartRecognitionRunnable
            r2.removeCallbacks(r3)
        L1b:
            return
    }

    public void setSearchResultProvider(androidx.leanback.app.SearchSupportFragment.SearchResultProvider r2) {
            r1 = this;
            androidx.leanback.app.SearchSupportFragment$SearchResultProvider r0 = r1.mProvider
            if (r0 == r2) goto L9
            r1.mProvider = r2
            r1.onSetSearchResultProvider()
        L9:
            return
    }

    @java.lang.Deprecated
    public void setSpeechRecognitionCallback(androidx.leanback.widget.SpeechRecognitionCallback r2) {
            r1 = this;
            r1.mSpeechRecognitionCallback = r2
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L9
            r0.setSpeechRecognitionCallback(r2)
        L9:
            if (r2 == 0) goto Le
            r1.releaseRecognizer()
        Le:
            return
    }

    public void setTitle(java.lang.String r2) {
            r1 = this;
            r1.mTitle = r2
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            if (r0 == 0) goto L9
            r0.setTitle(r2)
        L9:
            return
    }

    public void startRecognition() {
            r1 = this;
            boolean r0 = r1.mIsPaused
            if (r0 == 0) goto L8
            r0 = 1
            r1.mPendingStartRecognitionWhenPaused = r0
            goto Ld
        L8:
            androidx.leanback.widget.SearchBar r0 = r1.mSearchBar
            r0.startRecognition()
        Ld:
            return
    }

    public final void submitQuery(java.lang.String r2) {
            r1 = this;
            int r0 = r1.mStatus
            r0 = r0 | 2
            r1.mStatus = r0
            r1.focusOnResults()
            androidx.leanback.app.SearchSupportFragment$SearchResultProvider r0 = r1.mProvider
            if (r0 == 0) goto L10
            r0.onQueryTextSubmit(r2)
        L10:
            return
    }

    public final void updateFocus() {
            r2 = this;
            androidx.leanback.widget.ObjectAdapter r0 = r2.mResultAdapter
            if (r0 == 0) goto L1a
            int r0 = r0.size()
            if (r0 <= 0) goto L1a
            androidx.leanback.app.RowsSupportFragment r0 = r2.mRowsSupportFragment
            if (r0 == 0) goto L1a
            androidx.leanback.widget.ObjectAdapter r0 = r0.getAdapter()
            androidx.leanback.widget.ObjectAdapter r1 = r2.mResultAdapter
            if (r0 != r1) goto L1a
            r2.focusOnResults()
            goto L1f
        L1a:
            androidx.leanback.widget.SearchBar r0 = r2.mSearchBar
            r0.requestFocus()
        L1f:
            return
    }

    public final void updateSearchBarNextFocusId() {
            r2 = this;
            androidx.leanback.widget.SearchBar r0 = r2.mSearchBar
            if (r0 == 0) goto L2b
            androidx.leanback.widget.ObjectAdapter r0 = r2.mResultAdapter
            if (r0 != 0) goto L9
            goto L2b
        L9:
            int r0 = r0.size()
            if (r0 == 0) goto L25
            androidx.leanback.app.RowsSupportFragment r0 = r2.mRowsSupportFragment
            if (r0 == 0) goto L25
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            if (r0 != 0) goto L1a
            goto L25
        L1a:
            androidx.leanback.app.RowsSupportFragment r0 = r2.mRowsSupportFragment
            androidx.leanback.widget.VerticalGridView r0 = r0.getVerticalGridView()
            int r0 = r0.getId()
            goto L26
        L25:
            r0 = 0
        L26:
            androidx.leanback.widget.SearchBar r1 = r2.mSearchBar
            r1.setNextFocusDownId(r0)
        L2b:
            return
    }

    public final void updateSearchBarVisibility() {
            r2 = this;
            androidx.leanback.app.RowsSupportFragment r0 = r2.mRowsSupportFragment
            if (r0 == 0) goto L9
            int r0 = r0.getSelectedPosition()
            goto La
        L9:
            r0 = -1
        La:
            androidx.leanback.widget.SearchBar r1 = r2.mSearchBar
            if (r0 <= 0) goto L1c
            androidx.leanback.widget.ObjectAdapter r0 = r2.mResultAdapter
            if (r0 == 0) goto L1c
            int r0 = r0.size()
            if (r0 != 0) goto L19
            goto L1c
        L19:
            r0 = 8
            goto L1d
        L1c:
            r0 = 0
        L1d:
            r1.setVisibility(r0)
            return
    }
}
