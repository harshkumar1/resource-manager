"use strict";
var __decorate = (this && this.__decorate) || function (decorators, target, key, desc) {
    var c = arguments.length, r = c < 3 ? target : desc === null ? desc = Object.getOwnPropertyDescriptor(target, key) : desc, d;
    if (typeof Reflect === "object" && typeof Reflect.decorate === "function") r = Reflect.decorate(decorators, target, key, desc);
    else for (var i = decorators.length - 1; i >= 0; i--) if (d = decorators[i]) r = (c < 3 ? d(r) : c > 3 ? d(target, key, r) : d(target, key)) || r;
    return c > 3 && r && Object.defineProperty(target, key, r), r;
};
var __metadata = (this && this.__metadata) || function (k, v) {
    if (typeof Reflect === "object" && typeof Reflect.metadata === "function") return Reflect.metadata(k, v);
};
var core_1 = require('@angular/core');
var router_1 = require('@angular/router');
var http_1 = require('@angular/http');
require('rxjs/add/operator/toPromise');
var LoginInfo = (function () {
    function LoginInfo(username, email, password) {
        this.username = username;
        this.email = email;
        this.password = password;
    }
    return LoginInfo;
}());
exports.LoginInfo = LoginInfo;
var USERS = [
    new LoginInfo('admin', 'admin@rm.com', 'admin@123'),
    new LoginInfo('hshekhar', 'hshekhar@rm.com', 'password@123')
];
var AuthenticationService = (function () {
    function AuthenticationService(_router, _http) {
        this._router = _router;
        this._http = _http;
        this.title = 'app works!';
        this.isUserLoggedIn = false;
    }
    AuthenticationService.prototype.logout = function () {
        localStorage.removeItem("user");
        this._router.navigate(['login']);
    };
    AuthenticationService.prototype.login = function (loginInfo) {
        var data = JSON.stringify(loginInfo);
        console.log(data);
        var headers = new http_1.Headers({ 'Content-Type': 'application/json' });
        var url = "http://localhost:8080/api/v1/authenticate";
        this._http
            .post(url, data, headers)
            .toPromise()
            .then(function (res) {
            console.log(res.json());
            res.json().data;
        })
            .catch(this.handleError);
    };
    AuthenticationService.prototype.handleError = function (error) {
        console.error('An error occurred', error);
        return Promise.reject(error.message || error);
    };
    AuthenticationService.prototype.checkCredentials = function () {
        if (localStorage.getItem("user") === null) {
            this._router.navigate(['login']);
        }
        else {
            this._router.navigate(['']);
        }
    };
    AuthenticationService = __decorate([
        core_1.Injectable(), 
        __metadata('design:paramtypes', [router_1.Router, http_1.Http])
    ], AuthenticationService);
    return AuthenticationService;
}());
exports.AuthenticationService = AuthenticationService;
//# sourceMappingURL=authentication.service.js.map