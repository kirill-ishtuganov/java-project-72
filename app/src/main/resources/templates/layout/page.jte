@import hexlet.code.utils.NamedRoutes
@import gg.jte.Content
@import hexlet.code.dto.BasePage
@param Content content
@param BasePage page

<!DOCTYPE html>
<html lang="en">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>Анализатор страниц</title>
        <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/css/bootstrap.min.css" rel="stylesheet"
              integrity="sha384-rbsA2VBKQhggwzxH7pPCaAqO46MgnOM80zW1RWuH61DGLwZJEdK2Kadq2F9CUG65" crossorigin="anonymous">
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js"
                integrity="sha384-kenU1KFdBIe4zVF0s0G1M5b4hcpxyD9F7jL+jjXkk+Q2h455rYXK/7HAuoJl+0I4"
                crossorigin="anonymous"></script>
    </head>

    <body class="d-flex flex-column min-vh-100">
        <nav class="navbar navbar-expand navbar-dark bg-dark">
            <div class="container-fluid">
                <div class="collapse navbar-collapse" id="navbarNav">
                    <div class="navbar-nav">
                        <a class="nav-link" href="${NamedRoutes.rootPath()}">Главная</a>
                        <a class="nav-link" href="${NamedRoutes.urlsPath()}">Сайты</a>
                    </div>
                </div>
            </div>
        </nav>

        <main class="flex-grow-1">
            @if(page != null && page.getFlash() != null)
                <div class="rounded-0 m-0 alert alert-dismissible fade show alert-${page.getFlashType()}" role="alert">
                    <p class="m-0">${page.getFlash()}</p>
                    <button type="button" class="btn-close" data-bs-dismiss="alert" aria-label="Close"></button>
                </div>
            @endif
            <section>
                ${content}
            </section>
        </main>


        <footer class="footer border-top py-3 mt-5 bg-light">
            <div class="container-xl">
                <div class="text-center">
                    Ссылка на мой GitHub
                    <a href="https://github.com/kirill-ishtuganov" target="_blank">kirill-ishtuganov</a>
                </div>
            </div>
        </footer>
    </body>
</html>
