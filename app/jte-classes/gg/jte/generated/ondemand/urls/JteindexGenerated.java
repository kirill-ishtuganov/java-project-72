package gg.jte.generated.ondemand.urls;
import hexlet.code.dto.urls.UrlsPage;
import hexlet.code.utils.Formatter;
import hexlet.code.utils.NamedRoutes;
public final class JteindexGenerated {
	public static final String JTE_NAME = "urls/index.jte";
	public static final int[] JTE_LINE_INFO = {0,0,1,2,3,3,3,5,5,8,8,21,21,24,24,24,27,27,27,27,27,27,27,27,27,27,27,27,30,31,31,31,34,35,35,35,38,38,42,42,42,43,43,43,3,3,3,3};
	public static void render(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, UrlsPage page) {
		jteOutput.writeContent("\n");
		gg.jte.generated.ondemand.layout.JtepageGenerated.render(jteOutput, jteHtmlInterceptor, new gg.jte.html.HtmlContent() {
			public void writeTo(gg.jte.html.HtmlTemplateOutput jteOutput) {
				jteOutput.writeContent("\n        <div class=\"container-lg mt 5\">\n                <h1>Сайты</h1>\n                <table class=\"table table-bordered table-hover mt-3\">\n                        <thead>\n                        <tr>\n                                <th class=\"col-1\">ID</th>\n                                <th>Имя</th>\n                                <th class=\"col-2\">Последняя проверка</th>\n                                <th class=\"col-1\">Код ответа</th>\n                        </tr>\n                        </thead>\n                        <tbody>\n                                ");
				for (var url : page.getUrls()) {
					jteOutput.writeContent("\n                                        <tr>\n                                                <td>\n                                                        <a>");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(url.getId());
					jteOutput.writeContent("</a>\n                                                </td>\n                                                <td>\n                                                        <a");
					var __jte_html_attribute_0 = NamedRoutes.urlPath(url.getId());
					if (gg.jte.runtime.TemplateUtils.isAttributeRendered(__jte_html_attribute_0)) {
						jteOutput.writeContent(" href=\"");
						jteOutput.setContext("a", "href");
						jteOutput.writeUserContent(__jte_html_attribute_0);
						jteOutput.setContext("a", null);
						jteOutput.writeContent("\"");
					}
					jteOutput.writeContent(">");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(url.getName());
					jteOutput.writeContent("</a>\n                                                </td>\n                                                <td>\n                                                        <a>");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(url.getLastCheck() == null ? "" :
                                                            Formatter.dateToString(url.getLastCheck().getCreatedAt()));
					jteOutput.writeContent("</a>\n                                                </td>\n                                                <td>\n                                                        <a>");
					jteOutput.setContext("a", null);
					jteOutput.writeUserContent(url.getLastCheck() == null ? "" :
                                                            String.valueOf(url.getLastCheck().getStatusCode()));
					jteOutput.writeContent("</a>\n                                                </td>\n                                        </tr>\n                                ");
				}
				jteOutput.writeContent("\n                        </tbody>\n                </table>\n        </div>\n    ");
			}
		}, page);
		jteOutput.writeContent("\n");
	}
	public static void renderMap(gg.jte.html.HtmlTemplateOutput jteOutput, gg.jte.html.HtmlInterceptor jteHtmlInterceptor, java.util.Map<String, Object> params) {
		UrlsPage page = (UrlsPage)params.get("page");
		render(jteOutput, jteHtmlInterceptor, page);
	}
}
