[
  {
    "ProfileName": "CookieAttrubute-HttpOnly",
    "Name": "",
    "Enabled": true,
    "Scanner": 2,
    "Author": "@egarme",
    "Payloads": [],
    "Encoder": [],
    "UrlEncode": false,
    "CharsToUrlEncode": "",
    "Grep": [
      "true,,(?i)Set-Cookie:\\s*([^\u003d]+)\u003d([^;]+);(?!.*httponly)(?!.*expires\u003d[^;]*1970).*"
    ],
    "Tags": [
      "All",
      "CookieAttributes"
    ],
    "PayloadResponse": false,
    "NotResponse": false,
    "TimeOut1": "",
    "TimeOut2": "",
    "isTime": false,
    "contentLength": "",
    "iscontentLength": false,
    "CaseSensitive": false,
    "ExcludeHTTP": false,
    "OnlyHTTP": true,
    "IsContentType": false,
    "ContentType": "",
    "HttpResponseCode": "",
    "NegativeCT": false,
    "IsResponseCode": true,
    "ResponseCode": "400",
    "NegativeRC": true,
    "urlextension": "",
    "isurlextension": false,
    "NegativeUrlExtension": false,
    "isHeaderValue": false,
    "sequence": false,
    "NewHeaders": [],
    "MatchType": 2,
    "Scope": 2,
    "RedirType": 2,
    "MaxRedir": 0,
    "requestType": 1,
    "rawRequest": "",
    "payloadPosition": 0,
    "payloadsFile": "",
    "grepsFile": "",
    "IssueName": "Cookie Attrubute - HttpOnly",
    "IssueSeverity": "Low",
    "IssueConfidence": "Firm",
    "IssueDetail": "Cookie attribute \"HttpOnly\" not present: \u003cbr\u003e \u003cgrep\u003e",
    "RemediationDetail": "",
    "IssueBackground": "",
    "RemediationBackground": "",
    "Header": [],
    "VariationAttributes": [],
    "InsertionPointType": [],
    "Scanas": false,
    "Scantype": 0,
    "pathDiscovery": false,
    "changeHttpRequest": false,
    "showIssue": false,
    "changeHttpRequestType": 0
  }
]