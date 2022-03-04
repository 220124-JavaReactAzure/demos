"use strict";
var __awaiter = (this && this.__awaiter) || function (thisArg, _arguments, P, generator) {
    function adopt(value) { return value instanceof P ? value : new P(function (resolve) { resolve(value); }); }
    return new (P || (P = Promise))(function (resolve, reject) {
        function fulfilled(value) { try { step(generator.next(value)); } catch (e) { reject(e); } }
        function rejected(value) { try { step(generator["throw"](value)); } catch (e) { reject(e); } }
        function step(result) { result.done ? resolve(result.value) : adopt(result.value).then(fulfilled, rejected); }
        step((generator = generator.apply(thisArg, _arguments || [])).next());
    });
};
var __generator = (this && this.__generator) || function (thisArg, body) {
    var _ = { label: 0, sent: function() { if (t[0] & 1) throw t[1]; return t[1]; }, trys: [], ops: [] }, f, y, t, g;
    return g = { next: verb(0), "throw": verb(1), "return": verb(2) }, typeof Symbol === "function" && (g[Symbol.iterator] = function() { return this; }), g;
    function verb(n) { return function (v) { return step([n, v]); }; }
    function step(op) {
        if (f) throw new TypeError("Generator is already executing.");
        while (_) try {
            if (f = 1, y && (t = op[0] & 2 ? y["return"] : op[0] ? y["throw"] || ((t = y["return"]) && t.call(y), 0) : y.next) && !(t = t.call(y, op[1])).done) return t;
            if (y = 0, t) op = [op[0] & 2, t.value];
            switch (op[0]) {
                case 0: case 1: t = op; break;
                case 4: _.label++; return { value: op[1], done: false };
                case 5: _.label++; y = op[1]; op = [0]; continue;
                case 7: op = _.ops.pop(); _.trys.pop(); continue;
                default:
                    if (!(t = _.trys, t = t.length > 0 && t[t.length - 1]) && (op[0] === 6 || op[0] === 2)) { _ = 0; continue; }
                    if (op[0] === 3 && (!t || (op[1] > t[0] && op[1] < t[3]))) { _.label = op[1]; break; }
                    if (op[0] === 6 && _.label < t[1]) { _.label = t[1]; t = op; break; }
                    if (t && _.label < t[2]) { _.label = t[2]; _.ops.push(op); break; }
                    if (t[2]) _.ops.pop();
                    _.trys.pop(); continue;
            }
            op = body.call(thisArg, _);
        } catch (e) { op = [6, e]; y = 0; } finally { f = t = 0; }
        if (op[0] & 5) throw op[1]; return { value: op[0] ? op[1] : void 0, done: true };
    }
};
var formUser = document.getElementById("form_user");
if (formUser != null) {
    formUser.addEventListener("submit", function (event) {
        event.preventDefault();
        searchUser();
    });
}
else {
    console.log("This ID doesn't exist!");
}
// To grab lodestone ID and retrieve all gear equipped
function searchUser() {
    return __awaiter(this, void 0, void 0, function () {
        var searchUser, searchServer, html_code, response, character, response_lodestone, lodestone, gearset;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    searchUser = document.getElementById("searchUser").value;
                    searchServer = document.getElementById("searchServer").value;
                    html_code = "";
                    return [4 /*yield*/, fetch("https://xivapi.com/character/search?name=".concat(searchUser, "&server=").concat(searchServer))];
                case 1:
                    response = _a.sent();
                    return [4 /*yield*/, response.json()];
                case 2:
                    character = _a.sent();
                    console.log(character);
                    return [4 /*yield*/, fetch("https://xivapi.com/character/".concat(character.Results[0].ID))];
                case 3:
                    response_lodestone = _a.sent();
                    return [4 /*yield*/, response_lodestone.json()];
                case 4:
                    lodestone = _a.sent();
                    html_code += "<h1>".concat(lodestone.Character.Name, "</h1>");
                    html_code += "<img src=\"".concat(lodestone.Character.Portrait, "\" style=\"max-width: 30%; max-height: 30%;\"/>");
                    return [4 /*yield*/, gearSet(lodestone.Character.GearSet.Gear)];
                case 5:
                    gearset = _a.sent();
                    html_code += "<table>\n                    <thead>\n                        <tr>\n                            <th>Slot</th><th>Icon</th>\n                        </tr>\n                    </thead>\n                    <tbody>\n                        ".concat(gearset, "\n                    </tbody>\n                </table>");
                    document.getElementById("ffxiv_user").innerHTML += html_code;
                    return [2 /*return*/];
            }
        });
    });
}
// To grab all gear from lodestone
function gearSet(Gear) {
    return __awaiter(this, void 0, void 0, function () {
        var gearSlots, array;
        var _this = this;
        return __generator(this, function (_a) {
            switch (_a.label) {
                case 0:
                    gearSlots = Object.keys(Gear);
                    console.log(gearSlots);
                    return [4 /*yield*/, Promise.all(gearSlots.map(function (slot) { return __awaiter(_this, void 0, void 0, function () {
                            var item, gearResponse, gear;
                            return __generator(this, function (_a) {
                                switch (_a.label) {
                                    case 0:
                                        item = Gear[slot];
                                        return [4 /*yield*/, fetch("https://xivapi.com/item/".concat(item.ID))];
                                    case 1:
                                        gearResponse = _a.sent();
                                        return [4 /*yield*/, gearResponse.json()];
                                    case 2:
                                        gear = _a.sent();
                                        return [2 /*return*/, gear.IconHD];
                                }
                            });
                        }); }))];
                case 1:
                    array = _a.sent();
                    return [2 /*return*/, array.map(function (img, i) { return "<tr><td>".concat(gearSlots[i], "</td><td><img src=\"https://xivapi.com/").concat(img, "\"/></td></tr>"); })];
            }
        });
    });
}
//# sourceMappingURL=character.js.map