%%%-------------------------------------------------------------------
%% @doc perf_tests public API
%% @end
%%%-------------------------------------------------------------------

-module(perf_tests_app).

-behaviour(application).

-export([start/2, stop/1]).

start(_StartType, _StartArgs) ->
    perf_tests_sup:start_link().

stop(_State) ->
    ok.

%% internal functions
