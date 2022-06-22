<header class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0 shadow">
    <a class="navbar-brand col-md-3 col-lg-2 me-0 px-3" href="index.jsp"> <i class="fa-brands fa-redhat"></i> BLUE HATS </a>
    <button class="navbar-toggler position-absolute d-md-none collapsed" type="button" data-bs-toggle="collapse"
            data-bs-target="#sidebarMenu" aria-controls="sidebarMenu" aria-expanded="false"
            aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
    </button>
    <form class="text-center w-100" action="searchresult.jsp">
        <input class="form-control form-control-dark w-50 d-inline" name="empSearch" type="text" placeholder="Employee Search"
                   aria-label="Search">
            <button class="btn btn-primary d-inline">search</button>
    </form>

    <div class="navbar-nav">
        <div class="nav-item text-nowrap">
            <a class="nav-link" href="#"> <span class="fa fa-user fa-fw"></span><%= admin.getName()%></a>
        </div>
    </div>
    <div class="navbar-nav">
        <div class="nav-item text-nowrap">
            <a class="nav-link px-3" href="LogoutServlet"><span class="fa Example of sign-out fa-sign-out"></span> Sign out</a>
        </div>
    </div>
</header>