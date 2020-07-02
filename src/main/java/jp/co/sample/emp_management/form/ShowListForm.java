package jp.co.sample.emp_management.form;

/**
 * 従業員一覧の表示・検索で利用するフォーム.
 *
 * @author kanta.fujiwara
 */
public class ShowListForm {
	/** あいまい検索する名前 */
	private String search;

	public String getSearch() {
		return search;
	}

	public void setSearch(String search) {
		this.search = search;
	}
}