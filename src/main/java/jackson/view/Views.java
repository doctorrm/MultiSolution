package jackson.view;
/** 
 * @JsonView feature for display control.(which to display and which don't).
 *  For ¡°Normal view¡±, salary will be hidden, for ¡°Manager view¡±, display everything.
 * @Author doctorrm
 * @Time  2017-08-28 ÉÏÎç9:49:54
 */
public class Views {
	public static class Normal{};

	public static class Manager extends Normal{};
}
